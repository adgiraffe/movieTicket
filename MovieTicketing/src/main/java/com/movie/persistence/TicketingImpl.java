package com.movie.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.movie.domain.CustomerBean;
import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;

@Repository

public class TicketingImpl implements TicketingDAO {
	@Inject 
	private SqlSession session;
	
	@Override
	public void ticketRegister(String id,String name, String title, int seat, int pay) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userRegister(CustomerBean cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MovieBean movieSearch(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void theaterRegister(TheaterBean tb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movieRegister(MovieBean mb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MovieBean> movieList() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
	
}
