package com.caio.cursojava.pratica11;

public class Somatorio {
	static int somar(int num) {
		if(num < 2) {
			return 1;
		}
		return num + somar(num-1);
	}
}
