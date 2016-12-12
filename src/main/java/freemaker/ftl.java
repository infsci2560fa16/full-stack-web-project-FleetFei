/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freemaker;

/**
 *
 * @author fei
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import static spark.SparkBase.staticFileLocation;

public class ftl {
//   filepath= "src/helloworld.ftl"
        public static void readText(String filepath){
//                staticFileLocation("/public");
		//Freemarker configuration object
		Configuration cfg = new Configuration();
		try {
			//Load template from source folder
			Template template = cfg.getTemplate("src/main/resources/zintroduce.ftl");
			
			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("message", "Hello Pittsburgh!");

			//List parsing 
			List<String> countries = new ArrayList<String>();
			countries.add("India");
			countries.add("United States");
			countries.add("Germany");
			countries.add("France");
			
			data.put("countries", countries);

			
			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();

			// File output
			Writer file = new FileWriter (new File("C:\\FTL_helloworld.txt"));
			template.process(data, file);
			file.flush();
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
        }
	public static void main(String[] args) {
//		  staticFileLocation("/public");
		//Freemarker configuration object
              
                System.out.println(new File("ftl.java").getAbsolutePath());
		Configuration cfg = new Configuration();
		try {
			//Load template from source folder
			Template template = cfg.getTemplate("resources/spark.template.freemaker/zintroduce.ftl");
			
			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("message", "Hello Pittsburgh!");

			//List parsing 
			List<String> countries = new ArrayList<String>();
			countries.add("India");
			countries.add("United States");
			countries.add("Germany");
			countries.add("France");
			
			data.put("countries", countries);

			
			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();

			// File output
			Writer file = new FileWriter (new File("C:\\FTL_helloworld.txt"));
			template.process(data, file);
			file.flush();
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
        }
}
