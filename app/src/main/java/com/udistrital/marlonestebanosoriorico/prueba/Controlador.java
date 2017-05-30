package com.udistrital.marlonestebanosoriorico.prueba;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by esteban on 24/05/2017.
 */

public class Controlador {

    public static ArrayList<Iglesia> iglesias;


    public static void inicializarBD(){
        Controlador.iglesias = new ArrayList<>();
        Controlador.iglesias.add(new Iglesia(new LatLng(4.583861,-74.097587),"Iglesia Bethel"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.636405,-74.162686),"Iglesia Cristiana Cuadrangular"));
        Controlador.iglesias.add(new Iglesia(new LatLng(0.464166,-74.114267),"Iglesia Cristiana Filadelfia JV"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.650266,-74.135558),"Iglesia Cristiana Manantial de Vida Eterna- Cll 13"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.592833,-74.096187),"Iglesia Cristiana Manantial de Vida Eterna- Cll 3a sur"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.592147,-74.106237),"Iglesia Cristiana Manantial de Vida Eterna- Cra. 27"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.722823,-74.053098),"Iglesia Cristiana Rios de Alabanza"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.758565,-74.048529),"Iglesia Pentecostal Unida de Colombia"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.614602,-74.175891),"Iglesia Pentecostal Unida de Colombia *"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.705876,-7.410649),"Iglesia Pentecostal Unida de Colombia- Bachue"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.609321,-74.135497),"Iglesia Pentecostal Unida de Colombia- Carvajal"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.621692,-7.406887),"Iglesia Pentecostal Unida de Colombia- Central"));
        Controlador.iglesias.add(new Iglesia(new LatLng(0.456468,-74.153394),"Iglesia Pentecostal Unida de Colombia- Juan José Rondón"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.619881,-74.155128),"Iglesia Pentecostal Unida de Colombia- Kennedy"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.593301,-74.171277),"Iglesia Pentecostal Unida de Colombia- La Estancia"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.565885,-74.127027),"Iglesia Pentecostal Unida de Colombia- San Carlos"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.696611,-74.031968),"Iglesia Pentecostal Unida de Colombia- Usaquen"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.594859,-74.191247),"IV Iglesia Cristiana Presbiteriana Maranatha"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.623598,-74.085496),"Mision Carismatica Internacional"));
        Controlador.iglesias.add(new Iglesia(new LatLng(0.462374,-74.084546),"Mision Carismatica Internacional(G12)"));
        Controlador.iglesias.add(new Iglesia(new LatLng(4.654757,-74.067059),"Sin Muros Ministerio INternacional"));

    }
}
