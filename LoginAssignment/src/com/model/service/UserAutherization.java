package com.model.service;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Set;

public class UserAutherization {
	
	private int attempts=1;
	private static UserAutherization ref=null;
	private static String x=null;
	private long timediff=0l;
	private Instant Start;
	private Instant Stop;

	public void setInstantStart() {
		Start=Instant.now();
	}
	public void setInstantStop() {
		Stop=Instant.now();
	}
	
	public long getTimediff() {
		return timediff;
	}

	public void setTimediff() {
		timediff=Duration.between(Start, Stop).toMillis();
	}

	private UserAutherization(){
		
	}
	
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts() {
		this.attempts++;
	}
	public void resetAttempts() {
		attempts=1;
	}
	static HashMap<String, UserAutherization> hm=new HashMap<>();

	public static UserAutherization getUserAuth(String y) {
		if(x==null) {
			System.out.println("executing if statement");
			x=y;
			ref=new UserAutherization();
			hm.put(x, ref);
			return ref;
		}else if(x.equals(y)) {
			System.out.println("executing else if statement");
			UserAutherization user=hm.get(x);
			return user;
		}else {
			Set<String> s1=hm.keySet();
			for (String z : s1) {
				if(z.equals(y)) {
					System.out.println("for each loop");
					return hm.get(z);
				}
			}
			x=y;
			ref=new UserAutherization();
			hm.put(x, ref);
			return ref;
		}
	}
}
