package com.movie.persistence;

import java.util.List;

import com.movie.domain.CustomerBean;
import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;


public interface TicketingDAO {
	
	public void ticketRegister(String id,String name,String title,int seat,int pay);
	
	public void userRegister(CustomerBean cb);
	
	public MovieBean movieSearch(String title);
	
	public void theaterRegister(TheaterBean tb);
	
	public void movieRegister(MovieBean mb);
	
	public List<MovieBean> movieList();
}
