package com.syntax.class19;

public class HW3For19 {
    public static void main(String[] args) {
        ChemistryTeacher chemT=new ChemistryTeacher();
        chemT.name="Gameel";
        chemT.doExpermints="Organic";
        chemT.chem();
        MathTeacher math=new MathTeacher();
        math.name="John";
        math.specialMathSub="Gab";
        math.techMath();
        PianoTeacher pito=new PianoTeacher();
        pito.name="Noha";
        pito.playMusic="guitar";
        pito.pianoTecach();
    }

}
class Teacher{
    String name;
    String typeOfTech;
    void teach(){
        System.out.println(name+" Teaches "+typeOfTech);
    }
}
class MathTeacher extends Teacher{
    String specialMathSub;
    public void techMath(){
        System.out.println(name+" "+" teaches math is "+specialMathSub);
    }
}
class ChemistryTeacher extends Teacher{
    String doExpermints;
    public void chem(){
        System.out.println(name+" "+" teaches and chem is my "+doExpermints);
    }
}
class PianoTeacher extends Teacher{
    String playMusic;
    public void pianoTecach(){
        System.out.println(name+" teaches piano model and is "+playMusic);
    }

}
