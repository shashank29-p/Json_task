package com.torryharris.practice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class json {
  public static void main(String[] args) throws IOException, ParseException {

    parseEmployeeObject();
  }

  private static void parseEmployeeObject() throws IOException, ParseException {
    Object obj = new JSONParser().parse(new FileReader("employees.json"));
    System.out.println(obj);
    JSONObject jsonObject = (JSONObject) obj;
    String fullName = (String) jsonObject.get("fullname");
    System.out.println("fullname:" + fullName);
    Map address = ((Map) jsonObject.get("address"));
    Iterator<Map.Entry> itr1 = address.entrySet().iterator();
    System.out.println("address");
    while (itr1.hasNext()) {
      Map.Entry pair = itr1.next();
      System.out.println(pair.getKey() + " : " + pair.getValue());
    }
    Map id = (Map) jsonObject.get("ids");
    Iterator<Map.Entry> itr2 = id.entrySet().iterator();
    System.out.println("ids");
    while (itr2.hasNext()) {
      Map.Entry pairs = itr2.next();
      System.out.println(pairs.getKey() + " : " + pairs.getValue());
    }
  }
}


