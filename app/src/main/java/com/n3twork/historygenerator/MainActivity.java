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

    private String[] equipoApoyo= new String[]{
            "Una caravana",
            "Una armadura",
            "Permiso de la realeza para arrasar con todo",
            "Un curandero",
            "Viales de oro",
            "Un símbolo sagrado",
            "Palabras de ánimo",
            "Un martillo enano",
            "Set de mapas",
            "Una bolsa de contención"
    };

    private String[] pistas1 = new String[]{
            "Un trozo de vestimenta",
            "Huellas en el suelo",
            "Una casa antigua",
            "Mensajes rúnicos grabados en la piel",
            "Sombras en el callejón la noche anterior",
            "Se los vio juntos",
            "Esas monedas pertenecen ",
            "Estaba obsesionado",
            "El sacerdote tuvo visiones y lo vio",
            "Esos orcos siempre están implicados"
    };

    private String[] pistas2 = new String[]{
            "Un ladrón encapuchado",
            "Alguien intentó envenenarlo",
            "Una condena corrupta",
            "Jinetes exploradores",
            "Los vecinos se oponen a las visitas",
            "Los guardias impiden la entrada",
            "Mercenarios que intentan interceptar el mensaje",
            "Disturbios en las calles",
            "Un hechizo peligroso",
            "Animal furioso"
    };

    private String[] acceso = new String[]{
            "Un derrumbe obliga a cambiar el rumbo",
            "Escalar una montaña",
            "Introducirse en los barrios bajos de la ciudad",
            "Acceder a la corte real sin llamar la atención",
            "Sumergirse al océano/mar/laguna/río/lago",
            "Alcanzar el destino antes que el enemigo",
            "Encontrar al dragón y hacer que salga",
            "Largo viaje hacia un bosque inexplorado",
            "Camino como guardaespaldas (arduo camino)",
            "Un teletransporte por portal"
    };

    private String[] puestoAvanzado = new String[]{
            "Un molino abandonado",
            "Una taberna en medio de la tormenta",
            "Una aldea de centauros",
            "Un iglú",
            "Una iglesia con un sacerdote amable",
            "Una torre de vigilancia en lo alto de la colina",
            "Un campamento improvisado al frente de la gran puerta",
            "En las mazmorras, luego de ser aprisionados",
            "Un gran comedor lleno de personajes dormidos",
            "Un claro en un bosque"
    };

    private String[] dungeon = new String[]{
            "Academia militar del reino enemigo",
            "Los mausoleos prohibidos de la iglesia",
            "Las cavernas de los hombre-lagarto",
            "Una fábrica abandonada",
            "El gremio de los ladrones",
            "La gran torre del maligno hechicero",
            "El galeón del capitán",
            "El monasterio de fuego/aire/tierra/agua/luz/oscuridad",
            "La tumba del conquistador",
            "La granja del pastor anciano"
    };

    private String[] peligrosLugar = new String[]{
            "Lugar inundado",
            "El mago colocó muchas trampas",
            "Un muro ilusorio lo rodea, nada es lo que parece",
            "Allí era el lugar de reposo de muchos hombres peligrosos",
            "Está construido en un lugar inestable",
            "Los desechos mágicos son tantos, que los conjuros no funcionan bien",
            "El lugar tiene muchos pasadizos secretos",
            "Una hidra gigante cuida el lugar, pero se encuentra dormida",
            "Un olor nauseabundo invade cada rincón",
            "La pureza es tal que no se puede manchar de sangre el lugar"
    };

    private String[] decoracion = new String[]{
            "Velas",
            "Moho",
            "Obras de arte",
            "Pinturas graciosas",
            "Signos de combate",
            "Símbolos religiosos",
            "Decoración invisible",
            "Restos de comida por todos lados",
            "Notas e información en cada objeto",
            "Aspecto militar acorazado"
    };

    private String[] enemigosSecundarios = new String[]{
            "Muertos vivientes",
            "Guardias renegados",
            "Tribu de trasgos",
            "Fanáticos religiosos",
            "Niños enojados",
            "Objetos animados",
            "Medianos ladrones",
            "Ciudadanos engañados",
            "Animales enloquecidos",
            "Mercaderes agresivos"
    };

    private String[] momentoPjGracioso = new String[]{
            "Cocinero torpe",
            "Obispo tartamudo",
            "Rotura de arma en el peor momento",
            "Llave falsa",
            "El mapa se mancha de bebida",
            "Enemigo olvidadizo",
            "Bufón apresado",
            "Caída descuidada",
            "Enemigo altanero es acorralado",
            "Viejo verde"
    };

    private String[] momentoPjDrama = new String[]{
            "Muerte de la enamorada",
            "La salida fue tapada por un derrumbe",
            "El enemigo huyó, demasiado tarde",
            "Apresan al grupo para cocinarlos",
            "Desatan una maldición sobre sí mismos",
            "Un personaje cuelga de un precipicio",
            "El pueblo los culpa por un acto que no cometieron",
            "Por órdenes, no pueden ingresar al sitio elegido",
            "Inocente sacrificado sin motivo",
            "Le robaron su objeto más preciado"
    };

    private String[] zonaEspecial = new String[]{
            "Sala del trono",
            "Basurero",
            "Cripta gigante",
            "Guardería",
            "Sala de tortura",
            "Balcón con increíbles vistas",
            "Zona de entrenamiento",
            "Calabozo vacío con puertas secretas",
            "Centro de control de máquinas enanas",
            "Habitación del tesoro"
    };

    private String[] desafioEspecial = new String[]{
            "Cubo gelatinoso",
            "Ogro hechicero",
            "Hidra domesticada",
            "Minotauro Berserker",
            "Un juez supremo",
            "Una espada mágica",
            "Un demonio atrapado",
            "Un guardaespaldas profesional",
            "Un sacerdote que guía y bendice los pasos del enemigo",
            "Un dragón enfermo"
    };

    private String[] ayudaInesperada = new String[]{
            "Los enemigos de tus enemigos",
            "El propio patrón",
            "La guardia de la ciudad",
            "Los lacayos se vuelven entre sí",
            "En la biblioteca se encuentra una nueva pista",
            "El enemigo enferma",
            "Una muerto, revive",
            "Un amigo traiconero, vuelve",
            "Ayuda divina",
            "El pueblo nos apoya"
    };

    private String[] decisionesImportantes= new String[]{
            "Seguir la ley o hacer justicia por mano propia",
            "Devolver los objetos o quedárselos",
            "Atacar por sorpresa o directo",
            "Respetar a los dioses o no",
            "Extender el rumor o guardarlo",
            "Estudiar el artefacto o destruirlo",
            "Gastar hasta el último recurso o volver por suministros",
            "Pelear o escapar",
            "Atacar en la guarida o esperar a que salgan",
            "Noche o día"
    };

    private String[] traiciones = new String[]{
            "Resultó ser del otro bando",
            "El patrón estaba involucrado",
            "Debía ser destuido pero en realidad ayuda",
            "Emboscada",
            "Hay un topo en el grupo",
            "Llegaste tarde o a otro lugar",
            "El malo era en realidad el bueno",
            "Éramos los únicos que no conocíamos la verdad",
            "Sufres trastornos de personalidad",
            "Un amigo vende nuestra ubicación al enemigo"
    };

    private String[] jefe = new String[]{
            "Un dragón rojo/otro color",
            "Una madre enfurecida",
            "El tabernero más famoso de la ciudad",
            "Un antiguo capitán de la guardia",
            "El mano del rey",
            "La sacerdotisa sagrada",
            "El vagabundo errante",
            "El ladrón enmascarado",
            "Un titán",
            "Un golem"
    };

    private String[] tesoro = new String[]{
            "Montaña de monedas de un antiguo imperio",
            "Un cuadro gigante del mejor pintor",
            "Un arma sagrada",
            "Una armadura reluciente",
            "Un mapa de aventura",
            "Ropas, mudas y utencillos caros",
            "Las armas de los caídos",
            "Un cetro de poder",
            "El Cáliz de rubíes",
            "Jade y diamantes"
    };

    private String[] recompensa = new String[]{
            "Tierras",
            "Fama",
            "Honor",
            "Ascenso",
            "Lugar para vivir",
            "Comida caliente",
            "Barco",
            "Beso de la princesa",
            "El favor de un dios",
            "Un banquete"
    };

    private String[] repercusiones = new String[]{
            "Recomensa por nuestra cabeza",
            "Escapó y busca vengarse",
            "Somos los héroes y todos piden nuestra ayuda",
            "Uno de nosotros fue atrapado",
            "Nuestras convicciones se debilitaron",
            "Empezás a tener seguidores",
            "Destapa una conspiración",
            "Provoca una avalancha",
            "Debemos mantenernos ocultos",
            "Haces enojar a una poderosa organizacion/etc"
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
