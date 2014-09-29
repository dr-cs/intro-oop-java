importjava.util.ArrayList;

publicclassArrayListTypesDemo{

staticabstractclassGnome{
publicStringname;
publicGnome(Stringname){
this.name=name;
}
}

staticclassGardenGnomeextendsGnome{
publicGardenGnome(Stringname){super(name);}
}

staticclassUnderwearGnomeextendsGnome{
publicUnderwearGnome(Stringname){super(name);}
}

publicstaticvoidmain(String[]args){
ArrayList<Gnome>gnomes=newArrayList<>();
ArrayList<GardenGnome>gardenGnomes=newArrayList<>();
ArrayList<UnderwearGnome>underwearGnomes=newArrayList<>();

//Fine:Gnomeisasuperclass
gnomes.add(newGardenGnome("Corny"));
gnomes.add(newUnderwearGnome("Jaques"));

//Nuh,uh!Typeincompatibility.
underwearGnomes.add(newGardenGnome("CarrotTop"));
}

}
