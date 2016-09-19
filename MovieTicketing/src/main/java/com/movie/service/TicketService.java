package com.movie.service;

import java.util.List;

import com.movie.domain.MovieBean;
import com.movie.domain.TheaterBean;

public interface TicketService {

	public void ticketRegist();
	public void userRegist();
	public MovieBean movier();
	
	public void theaterRegister();
	public TheaterBean theaterReturn();
	
	public void movieRegister();
	public List<MovieBean> movieList();	
}
