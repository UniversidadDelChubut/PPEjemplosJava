package edu.udc.pp.agregacioncomposicion;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Viaje {
	
	private TerminalCarga origen;
	private TerminalCarga destino;
	private Date partida;
	private Date arribo;
	private List<LoteCarga> carga = new LinkedList<>();
	
	public Viaje(TerminalCarga origen, TerminalCarga destino, Date partida, Date arribo) {
		this.origen = origen;
		this.destino = destino;
		this.partida = partida;
		this.arribo = arribo;
	}

	public void agregarLoteCarga(LoteCarga loteCarga) {
		this.carga.add(loteCarga);
	}
	
	public void quitarLoteCarga(LoteCarga loteCarga) {
		this.carga.remove(loteCarga);
	}

	public TerminalCarga getOrigen() {
		return origen;
	}

	public TerminalCarga getDestino() {
		return destino;
	}

	public Date getPartida() {
		return partida;
	}

	public Date getArribo() {
		return arribo;
	}

	public List<LoteCarga> getCarga() {
		return new LinkedList<>(carga);
	}
	
}
