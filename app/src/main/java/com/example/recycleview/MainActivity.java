package com.example.recycleview;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

/*
Recycle View

recape listview,gridview:
ListView,GridView:keen 3ana function esma getview() hayde l function 3atoul btestd3a bkel 3osnrour bel listview,gridview 3atoul btesd3a b 2aye wa2t
getview():- kona 2awl she l getview() bteb3tle l 3onsour b2alb listview,2aw gridview
          -ba3den ana bkoun 3emel tasmem masln fe b2albo tetview,image heed tasmem ba3mlo infalte b2alb 3anaser listview,gridview
          -berja3 ba3mel finviewbyid() inflate lal 3anaser le b2alb tasmem
          -ba3den bjeeb object lal 3onsour le ana we2ef 3lee w b3abe data ba3den b2alb l 3anasr ta3el tasmem
          -w kona na3mel eno iza 2awl mara sha8lneha lal app fa 7a yenba3 l tasmem ta3el lisview null fadye w iza kenet fadye 3meel inflate tasmem 3lyha
          -iza la2 ne7na kona 3am na3mel scroll 7a na3mel findviewbyid lal 3anser w n8ayer data bas kel mara mna3mel scroll w bebyen 3onsour jded ba3mel findviewbyid la 3anaser le b2alb tasmem w b3abe datas
          -listview,gridview:la n22ol shshe ta3etna btsee3 bas 9 3anaser fa 7a yen3aml inflate la 9 3anaser w law 3onsour 7ata law mbyen tarfo 7a ye3mlo inflate ysero 10 3anaser  ya3ne l 3anaser le byne kolyan 2aw jez2eyan 7a yestad3o l getview() 3lyhoun
          -w kona na3mel if(view==null) inflate lesh 3ashen la n2ol eno shsheshtna btsee9 9 3anaser 7a yen3ml inflate lal kol ba3den ne7na 3mlna scroll nzelna la ta7t 7a ybyen 9 3anaser jdeede w 9 3anaser l 2ademe 7a te5tefe bas ma 7a yen3ml inflate lal 9 3anaser l jdede bas 7a yen3ml findviewbyid lal 3anaser le jowet tasmem w yen7at data 7asb l postion lesh l2no ne7na 2awl ma ndawer shshe mna3ml inflate la kel l 3anaser bas l 3anaser le ma btsee3 3al shshe bte5tfe fa bas la nerja3 na3ml scroll w ybyen 3anaser jdede fa bas yen3ml getview() lal 3anaser l jdeede 7a tkoun ma3mola inflate fa ma 7a tfout 3al if(view==null) inflate la2 bas 7a yen3ml infltae lal 3anser le jowa tasmem w yen7at data



Recycle view():Tyeb ana bade esta3ml listview,gridview b application da5m w fee da8t 3alal shshe mn l users le feha lisview 2aw grid view eh mtl application l insta,facebook..etc enta bhaw l application ma btl7ez l performance enta bta3ml scroll kteer law 7asbt adesh 3ardt posts w comments kteer hay l 7arake bt2alle l performance ta3el l application w btesb7ab mn l battary lesh l2no kel mara enta 3am ta3ml scrooll w ybyen 3osnour jdded 3am ta3ml inflate lal 3anser le jowa l tasmem w t3abe data b2alba bas b kel post ta2rebn fe aktar mn 15 view bde5l tasmem fa kol mara 3am na3mel inflate a haw l 3anser fa hay l sha8le ejo 7aloha b recycle view

Recycleview:eja alak badal ma enta kol mara ta3ml findviewbyid() alak ma howe nafso l 3onour la kel l listview,gridview mkarar bas data 3am tet8ayar
2alak mesh enta bas ta3ml scroll down 2aw up fe 3andak 3anaser bte5tefe lesh ma ana besta3ml haw le bye5tfo la 2o3roud 3anaser jdeede ya3ne bma 2no howe nafsoun zetoun fa best3loun w bas b8ayer data jewetoun
fa eja 3andak recycle view le bt7ol l mashekl wa7de menon eno bt3eed est3ml l 3anser le bte5tfe 5elel ma enta bta3ml scroll
ya3ne enta 3andak 9 3anser b shshe ma3mouloun inflate bas le bynen 3al shshe 3ml scroll fa 5tafo 3onsouren w badoun ybayeno 3onsouren jdaad tyeb haw l 3onsouren le 5tafo mesh enta 3emloun inflate w 3mel inflate lal 3anser le b2alboun fa tamem enta bas 8ayer data le b2lboun

fa 2alak bade 2a3ml 7al la hay sha8le sho heye l 3anser le bte5tfe bas ta3ml scroll bade 2a3ml inflate la 2ela ya3ne findviewbyid() mesh bas heek bade kel l 3anser le 3mltela inflate ta3et tasmem le ana 3mlto bade 5azena b ma7al esmo viewholder 2aw bel 3arabe 7awyet l view ya3ne l 3anser le b2alb tasmem bade jame3a 2a3mla inflate w 5azena b ma7al wa7ad esmo viewholder 3ala ases la ma ana 2a3ml scroll w bayne 3onour jdeed esta5dem l ma3lomet le ftafet 3mlnela save bel view holder bas 8ayer l data le feha
ya3ne hla2 bas bade 2a3ml reccyele view bade 2olo la recycleaddapter eno ma ta3ml bas inflate lal 3ansser b2alb tasmem 3mlee inflate w 7afez haw l ma3lomet bel view holder 3ashen mesh kel mara bade 2o3roud 3onsour jdeed estad3oun lal findview by id la2 heek b7afezoun w bseer bas b8ayer data lal item le b2alb recycle view le 5tafet

example:3ande 100 3onsour b lista w kel 3onour b2alba 4 view
in listview,gridview:7a etar 2a3ml inflate la kel l 3anser 2awl she ba3den kel 3onsour jdeed bebyen bade 2a3mlo findviewbyid lal 3anser le b2alb tasmem w 8ayer data
in recycle view:7a 2a3ml inflate bas lal 3anser le 7a tbyen 3al shshe la n2ool shshe btsee3 9 3anser 7a 2a3ml inflate la 9 3anser w 7a 2a3ml findveiwbyid() lal 4 3anser b design  w 5azena b view holder w heek ma betar kel mara bebyn 3onour jdeed 2a3ml finveiwbyid lal views b2alb l design le 3mlto bhay tare2a bas b8ayer data kel ma 2a3mel scroll b8ayer bas bel data

Recycle view howe mawjoud bel support library

















 */











public class MainActivity extends AppCompatActivity implements ItemClickListener {
RecyclerView recyclerView;
ArrayList<club> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rec);
        arrayList=new ArrayList<>();

        arrayList.add(new club("barca","5"));
        arrayList.add(new club("barca","5"));
        arrayList.add(new club("barca","5"));
        arrayList.add(new club("barca","5"));
        //object mn l addapter recycleview
        RecycleViewAddapter recycleViewAddapter=new RecycleViewAddapter(arrayList);

        //ba3den 3andak class esmo layoutmanger lezm testa3mlo ma3 l recycle view:
        //heed sho8l ta3el eno ya3ref aymta yestd3e kel method aymta ya3ref eno 5tafa 3onour aymta bas yestd3e l onbind aymta l oncreate heed she8l layoutmanager howe bedera kola
        // layoutmanger:howe wazefto ykoun moder de5el l recydle view ya3nde le byetwala aymta yesd3e l oncreateviewholder mesh ana wala l adapter layutmanager,w nafs she bel nesbe lal onbindviewholder ,getcount ya3ne howe bedera kola lahwde l function w bya3rf taw2et l monesesb aymta yestad3e kel wa7de w aymta ma yestd3e
        //LinearLayoutManager():listview vertical
        //StaggeredGridLayoutManager():mesh grid y3ne mesh keloun ad ba3d fe she 2akbar mn she
        // GridLayoutManager():gridview ya3ne


        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager1=new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        //fek ba3den t8ayer direction ta3el l layout horizantal wala vertical
        //horizantal:        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        //e5er parameter ya3ne reverse layout:l howe iza 7ayto true 7a yseer e5er 3onour b arraylist 7a yen3arad 2awl wa7ad w 2awl 3onour bel arraylist e5er wa7ad ya3ne 7a yetsha2lb l 3adad mn l 2e5er lal 2awl hay bel nesbe lal linear layout manager vertical
        //e5er parameter ya3ne reverse layout:l howe iza 7ayto true 7a yseer e5er 3onour b arraylist 7a yen3arad 3al shmel  w 2awl 3onour bel arraylist 3al yamen  ya3ne 7a yetsha2lb l 3adad mn l 2e5er lal 2awl hay bel nesbe lal linear layout manager horizantal
        //iza badak ydalo l 3anser metl ma enta 7aytoun 7ot false


        //kamen iza grid feek t7aded 3ada l colum:
        //        RecyclerView.LayoutManager layoutManager1=new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        //houn grid w 3adad l column 2 w l oriantaion vertical w l 5ale layout metl ma houne ma yetsha2labo
        //iza oriantaion true w vertical:7a yetsha2lbo heek
        /*

        before:1 3 5 7
               2 4 6 8

        after:7 5 3 1
              8 6 4 2


        in horizantal:

        before:
        1 2
        3 4
        5 6
        7 8

        after:
        2 1
        4 3
        6 5
        8 7

        */

        //ba3den fe attribute eza badak l 3anser ykoun fixed size ma yet8ayar 7ajmoun
        recyclerView.setHasFixedSize(true);

        //ba3en ba3te la recycle view layout manager
        recyclerView.setLayoutManager(layoutManager);

        //ba3den ba3te l addapter
        recyclerView.setAdapter(recycleViewAddapter);

        recycleViewAddapter.setclicklistener(this);

    }

    @Override
    public void onClick(View view, int postion) {
        Toast.makeText(this, ""+arrayList.get(postion).getTitle_team(), Toast.LENGTH_SHORT).show();
    }
}