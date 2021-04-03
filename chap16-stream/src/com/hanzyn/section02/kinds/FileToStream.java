package com.hanzyn.section02.kinds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * 보통 스트림을 collection 객체나 배열에 저장된 데이터를 스트림 객체로 생성하는 경우가 많다.
 * 하지만 외부에 저장된 파일이나 파일의 내용을 스트림에 저장할 수 있는데,
 * 외부 파일에서 Stream 객체를 생성하는 경우는 String 타입으로 저장된다.
 * */

//strToStream.java 파일을 Stream 객체로 생성해서 출력하는 예제

public class FileToStream {
	public static void main(String[] args) {
		try {
			//Paths.get() 메서드 사용
			Path path = Paths.get("src/com.hanzyn.section02.kinds/strToStream.java");
			Stream<String> stream  = Files.lines(path, Charset.defaultCharset());
			stream.forEach(s->System.out.println(s));
			stream.close();
			System.out.println();
			
			//BufferedReader의 lines() 메서드 사용
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s->System.out.println(s));
			stream.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
