package com.movie.persistence;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import com.movie.domain.MovieBean;

@Repository
public class DaumApi {
	public MovieBean movieSearch(String keyword) throws UnsupportedEncodingException, IOException, ParseException{
		
		try {
			URL url = 
					new URL("https://apis.daum.net/contents/movie?apikey=77eeed7ba7ce787a48978ff2e868fcc4&q="+keyword+"&output=json");
			InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream(), "UTF-8");
			JSONObject object;
			
			object = (JSONObject)JSONValue.parseWithException(isr);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return null;
	}
	
}
