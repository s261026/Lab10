package it.polito.tdp.rivers.model;

import java.sql.Date;
import java.util.PriorityQueue;

public class Simulatore {
	
	//modello: stato del sistema che cambia a ogni passo e influenza il sistema
	private double c;
	private Flow fint;
	private Flow fout;
	
	//coda prioritaria
	private PriorityQueue <Evento> queue;
	
	//parametri della simulazione costanti
	private Date primaMisurazione;
	private Date ultimaMisurazione;
	private Flow fmed;
	River river;
	
	//valori di output
	private int giorniNo;
	private int cmed;
	
	
	//inizializzazione
	public void init(int k, River fiume) {
		
		//parametri iniziali
		this.river=fiume;
		double Q = k*30*24*3600*(fmed.getFlow());
		this.c=Q/2;
		
		//imposto lo stato iniziale
		double foutmed = this.fout.getFlow()*0.8;
		giorniNo=0;
		cmed=0;
		
		//creo la coda
		this.queue= new PriorityQueue <Evento>();
		
		//inserisco il primo evento
		this.queue.add(new Evento(k, giorniNo, cmed));
	}
	
	public void run() {
		Evento e;
		while((e=this.queue.poll())!=null) {
			
		}
	}
}
