package com.n3twork.historygenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonGenerar;

    private String[] leyenda = new String[]{
            "Quién rompa la antigua maldición adquirirá su poder",
            "El difunto Rey escondió allí toda su herencia",
            "Sólo los elegidos podrán entrar",
            "Quién lo recupere podrá conquistar su corazón",
            "Nadia volvió con vida del lugar",
            "Marcará el inicio de una nueva era",
            "Cuando se resuelva se econtrará el lugar exacto",
            "Según los rumores, en realidad no existe",
            "Si no se logra, una plaga azotará la región"
    };

    private String[] zonaInicio = new String[]{
            "La ciénega del troll",
            "La capital imperial",
            "El camino real",
            "Un campo de batalla",
            "Un puerto",
            "Un oasis en el desierto",
            "Una ciudad enana en medio de las montañas",
            "El festival de los mercaderes",
            "Unas islas en el medio del mar",
            "La aldea de los trasgos"
    };

    private String[] motivosEncuentro = new String[]{
            "Bebiendo unas cervezas",
            "Por un cartel de *** recompesa *** ",
            "Por un familiar en común",
            "Porque estuvieron en la mismas batallas",
            "En una subasta",
            "Peleándose en la taberna",
            "Por una carta anónima de reunión",
            "Por compartir la Fe",
            "Compañeros mercenarios",
            "Poseedores del mismo objeto"
    };

    private String[] patron = new String[]{
            "Un mercader rico",
            "El consejo de sabios",
            "Una madre indefensa",
            "El jefe de una banda de ladrones",
            "Un dragón",
            "Un mago loco",
            "Un objeto mágico",
            "Una elfa encapuchada",
            "Un mercader con un mapa",
            "El capitán de la guardia"
    };

    private String[] reunion = new String[]{
            "Por la noche en la taberna cerca del puerto",
            "En una lujosa mansión en el barrio noble",
            "En la parte trasera de la armería",
            "En la corte real",
            "En la caverna oculta en la cascada",
            "En la universidad del pueblo",
            "En la caravana",
            "Durante un ritual religioso",
            "En las mazmorras del castillo",
            "En una cama del burdel"
    };

    private String[] misterioInic = new String[]{
            "Una obra de arte robada",
            "Un cadáver abandonado",
            "Unas tumbas saqueadas",
            "El secuestro de un noble",
            "La búsqueda de un niño perdido",
            "Una extraña luz",
            "Falta de suministros en el pueblo",
            "Ruidos en las alcantarillas",
            "La aparición de un monstruo",
            "Leyes injustas y estrictas"
    };

    private String[] motivacion = new String[]{
            "Promesa de ascenso",
            "Conseguir un objeto poderoso",
            "Saciar tu sed de venganza",
            "Conquistar el lugar",
            "Explorar lugares insólitos",
            "Devolver un favor",
            "Pagar una deuda",
            "Fortuna inimaginable",
            "Títulos",
            "Limpiar a la competencia"
    };

    private String[] contactos = new String[]{
            "El director de la Universidad",
            "Un ex-capitán semiorco",
            "Un fallecido que vio algo",
            "Un preso loco",
            "El anciano druida del bosque",
            "Las sirenas de la isla Cantora",
            "El guardia de la mazmorra",
            "Un explorador de la realeza",
            "El elegido de tu Dios",
            "La/El tabernera/o"
    };

    private int numAleatorio;

    //numero = (int) (Math.random() * n) + 1;
    //Donde n es hasta el número que quieres que llegue, + 1 para que nunca tengas un 0
    // y el cast a  int porque Math.random arroja un valor de tipo double.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonGenerar = findViewById(R.id.botonGenerar);

    }

    public void Generar(View v){

        numAleatorio = (int) (Math.random() * 10) + 1;



    }

}
