package com.java.epariksha.dao;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Subject;
import com.java.epariksha.helper.CSVHelper;
import com.java.epariksha.repository.CSVRepository;

@Service
public class CSVService {
  @Autowired
  CSVRepository repository;

  public void save(MultipartFile file,Subject subject) {
    try {
      List<Question> tutorials = CSVHelper.csvToTutorials(file.getInputStream(), subject);
      repository.saveAll(tutorials);
      System.out.println("no of que "+tutorials.size());
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<Question> tutorials = repository.findAll();

    ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
    return in;
  }

  public List<Question> getAllTutorials() {
    return repository.findAll();
  }
}
