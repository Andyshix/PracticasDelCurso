package model;

import java.awt.*;
import java.util.ArrayList;

public class Game implements UnoGame {
    private Baraja baraja;
    private ArrayList<UnoCard> mazo;
    private ArrayList<Player> jugadores;
    private Player jugadorActual;
    private UnoCard currentCard;
    private ArrayList<UnoCard> basurero;
    private int direccion;

    public Game(){
        baraja = new Baraja();
        mazo = baraja.generarMazo();//96cartas
        jugadores = new ArrayList<>(4);
        jugadorActual = null;
        currentCard = null;
        basurero = new ArrayList<>();
        direccion = 1;//derecha
        Player jugador1 = new Player("Jugador 1");
        Player jugador2 = new Player("Jugador 2");
        Player jugador3 = new Player("Jugador 3");
        Player jugador4 = new Player("Jugador 4");
        agregarJugadores(jugador1,jugador2,jugador3,jugador4);
    }

    private void agregarJugadores(Player jugador1,Player jugador2,Player jugador3,Player jugador4){
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        int aleatorio = (int)(Math.random()*jugadores.size());// 4jugadores
        jugadorActual = jugadores.get(aleatorio);
        repartirCartas();
    }

    private void repartirCartas(){
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                UnoCard carta = mazo.get(1);
                jugadores.get(i).recibeCarta(carta);
                mazo.remove(1);
            }
        }
        currentCard = mazo.get(1);
        basurero.add(currentCard);
        mazo.remove(1);
    }

    @Override
    public Player whoWin() {
        Player res=null;
        boolean bb=false;
        for(int i=0;i<jugadores.size()&&bb==false;i++){
            Player jugadorAct = jugadores.get(i);
            if(jugadorAct.sinCartas()==true){
                res = jugadorAct;
                bb =true;
            }
        }
        return res;
    }

    @Override
    public ArrayList<UnoCard> getCardsCurrentPlayer() {
        return jugadorActual.getMano();
    }

    @Override
    public ArrayList<Player> getPlayers() {
        return jugadores;
    }

    @Override
    public UnoCard getCurrentCard() {
        return currentCard;
    }

    @Override
    public Player getCurrentTurn() {
        return jugadorActual;
    }

    @Override
    public boolean dropCard(UnoCard card) {
        boolean res;
        String valueUltCarta = currentCard.getValue();
        Color colorUltCarta = currentCard.getColor();
        String valueCard = card.getValue();
        Color colorCard = card.getColor();
        if(colorUltCarta==colorCard||valueCard.equals("C")||valueCard.equals(valueUltCarta)){
            res = true;
            basurero.add(card);
            int pos = jugadorActual.getMano().indexOf(card);
            jugadorActual.getMano().remove(pos);
        }else{
            res = false;
        }
        if(valueCard.equals("R")){
            if(direccion==0){
                direccion=1;
            }else{
                direccion=0;
            }
        }
        return res;
    }

    @Override
    public void loadCard() {
        UnoCard carta = mazo.get(1);
        jugadorActual.recibeCarta(carta);
        mazo.remove(1);
        jugadorActual.setVariableTurno();
    }

    @Override
    public boolean nextTurn() {
        boolean res;
        if(jugadorActual.getVariableTurno()==true){
            res = true;
            jugadorActual.setVariableTurno();
            int pos = jugadores.indexOf(jugadorActual);
            if(direccion==0){
                jugadorActual = jugadores.get(pos-1);
            }else if(direccion==1){
                jugadorActual = jugadores.get(pos+1);
            }
        }else{
            res = false;
        }
        return res;
    }

    @Override
    public int sizeDeck() {
        return mazo.size();
    }

    /*
     * 0 -> Izquierda
     * 1 -> Derecha
     */
    @Override
    public int getDirection() {
        return direccion;
    }

    @Override
    public void shuffle() {
        while(sinCartas(basurero)==false){
            UnoCard carta = basurero.get(1);
            mazo.add(carta);
            basurero.remove(1);
        }
        barajearMazo();
    }

    private boolean sinCartas(ArrayList mano){
        return mano.isEmpty();
    }
    private void barajearMazo(){
        UnoCard carta = null;
        int aleatorio = 0;
        for(int i=0;i<mazo.size();i++){
            aleatorio =(int)(Math.random()*mazo.size());
            carta = mazo.get(i);
            mazo.set(i,mazo.get(aleatorio));
            mazo.set(aleatorio, carta);
        }
    }
}
