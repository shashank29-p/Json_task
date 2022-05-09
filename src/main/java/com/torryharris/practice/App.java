package com.torryharris.practice;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
  public static void json() {
    JsonObject jsonObject = new JsonObject();
    jsonObject.put("fullname", "kathleen brown");
    Map m1 = new LinkedHashMap();
    m1.put("street", "banglore 5th cross");
    m1.put("city", "rr nagar");
    jsonObject.put("address", m1);
    JsonArray jsonArray = new JsonArray();
    jsonArray.add(0, "123");
    jsonArray.add(1, "222");
    jsonArray.add(2, "344");
    Map m2 = new LinkedHashMap();
    m2.put("pan", "2Jktps32");
    m2.put("adhar", "28876354232");
    m2.put("employee ids", jsonArray);
    jsonObject.put("ids", m2);
    for (int i = 0; i < 1; i++) {
      try (FileWriter file = new FileWriter("employees.json")) {
        file.write(jsonObject.encodePrettily());
        file.flush();
        System.out.println(jsonObject.encodePrettily());

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    json();
  }
}
