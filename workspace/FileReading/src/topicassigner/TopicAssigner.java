package topicassigner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TopicAssigner {
	
	List<String> topics;
	List<String> students;
	
	public TopicAssigner() {
		this.topics = new ArrayList<>();
		this.students = new ArrayList<>();
	}
	
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	
	public void addStudent(String s) {
		this.students.add(s);
	}
	
	public void addTopic(String t) {
		this.students.add(t);
	}
	
	public void readInput(String textFile, String list) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				
//				Pattern pw = Pattern.compile(delimiter);
//				Matcher mw = pw.matcher(line);
//				
//				mw.reset(line);
				
				if (list.equals("topics")) {
					this.topics.add(line);
				}
				else if (list.equals("students")) {
					this.students.add(line);
				}
				else {
					System.out.println("Is this list a list of topics or students?");
				}
			}
				
		} catch (Exception e) {
				System.err.println(e);
		}
	}
	
	public Map<String, String> shuffleMatch() {
		
		Map<String, String> matches = new HashMap<>();
		int counter = 0;
		
		Collections.shuffle(this.students);
		Collections.shuffle(this.topics);
		
		for(String s : topics) {
			matches.put(s, students.get(counter++));
			if (counter == students.size()) {
				counter = 0;
			}
		}
		
		return matches;
	}
}
