package it.polito.tdp.rivers.model;

public class Evento implements Comparable <Evento>{
	
	private int k;
	private int nGiorniNoErogazione;
	private int cMed;
	

	public Evento(int k, int nGiorniNoErogazione, int cMed) {
		super();
		this.k = k;
		this.nGiorniNoErogazione = nGiorniNoErogazione;
		this.cMed = cMed;
	}


	public int getK() {
		return k;
	}



	public void setK(int k) {
		this.k = k;
	}



	public int getnGiorniNoErogazione() {
		return nGiorniNoErogazione;
	}



	public void setnGiorniNoErogazione(int nGiorniNoErogazione) {
		this.nGiorniNoErogazione = nGiorniNoErogazione;
	}



	public int getCmed() {
		return cMed;
	}



	public void setCmed(int cMed) {
		this.cMed = cMed;
	}





	@Override
	public int compareTo(Evento arg0) {
		return this.k-arg0.k;
	}

}
