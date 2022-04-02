package com.java.epariksha.helper;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;

import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Subject;

public class CSVHelper {
  public static String TYPE = "text/csv";
  static String[] HEADERs = {"question_level","question", "option1", "option2", "option3","option4","answer"};

  public static boolean hasCSVFormat(MultipartFile file) {

    if (!TYPE.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  public static List<Question> csvToTutorials(InputStream is,Subject subject) {
    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        CSVParser csvParser = new CSVParser(fileReader,
            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

      List<Question> questions = new ArrayList<Question>();

      Iterable<CSVRecord> csvRecords = csvParser.getRecords();

      for (CSVRecord csvRecord : csvRecords) {
    	  Question quest = new Question(
//              Integer.parseInt(csvRecord.get("question_id")),
              csvRecord.get("question_level"),
              csvRecord.get("question"),
              csvRecord.get("option1"),
              csvRecord.get("option2"),
              csvRecord.get("option3"),
              csvRecord.get("option4"),
              csvRecord.get("answer"),
              subject
            );

    	  questions.add(quest);
      }

      return questions;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
    }
  }

  public static ByteArrayInputStream tutorialsToCSV(List<Question> questions) {
    final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
        CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
      for (Question question : questions) {
        List<String> data = Arrays.asList(
              String.valueOf(question.getQuestionId()),
              question.getQuestion(),
              question.getOption1(),
              question.getOption2(),
              question.getOption3(),
              question.getOption4(),
              question.getAnswer(),
              question.getQuestionLevel()
            );

        csvPrinter.printRecord(data);
      }

      csvPrinter.flush();
      return new ByteArrayInputStream(out.toByteArray());
    } catch (IOException e) {
      throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
    }
  }

}
