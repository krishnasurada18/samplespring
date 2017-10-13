package samplespring;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BarcodeDao {
  @Autowired
  SessionFactory sf;
}
