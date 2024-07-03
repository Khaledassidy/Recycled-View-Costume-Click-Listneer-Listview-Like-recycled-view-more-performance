package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//first extend  RecyclerView.Adapter
// RecyclerView.Adapter<VH> bye5od generic type VH le howe view holder le class l  mn5azen feh l findviewbyid l inflate   ta3el design
//fa 3ashen 7ot generic type brou7 ba3mel inner class esmo viewholder
//fa ba3mel class esmo masln myviewholder w b5ale extends mn l vieholder 3ashn yet3arf eno eno heed l class viewholder ba3den heed l clss lezm ta3mlo cosntuctor l2no l ab 3ando constrctor heed l constructor 3ando parameter view bye5oda w byeb3ata lal ab l howe Recycleview.viewholder
//ba3d ma 3mlna l vieholder class bas jahzne b7ot generic type ta3el Recycleview.Addapter howe viewholder l class le 3mlto <RecycleViewAddapter.viewholder>
//ba3den b2olak badak ta3ml implemntation  lal functions ta3wlet l recycleview l hone:onCreateViewHolder,onBindViewHolder,getItemCount()

//2awl she mnla7ez eno method l onCreateViewHolder btrej3 object mn l class le 3mlto l esmo viewholder w function  onBindViewHolder bte5od parameter viewholder tyep keef 3eref eno bade et3eml ma3 heed l class hay feydet l generic type ana 2awl ma 2oltelo b generic type howe vieholder ta3ele fa ra7 3emel overide lal function 3a asseso


// onCreateViewHolder:yatem ested3e2a 2awl mara bas yen3ered l 3onour b recycle view ya3ene ana 2awl ma sha8lt l application fa bado yrou7 yo3roud 9 3anser le bese3o 3a shshe fa berou7 byestad3e l onCreateViewHolder 3ashen yen3amloun create la haw l 3anser 9 byeb3at ma3a l parent w l veiwtype le howe nou3 l view
//be ma2no 3am n2ool eno ne7na mara wa7de mnestad3eha w heye btesd3a 2awl ma yseer enshe2 la 3anser l recycle veiw fa bade rou7 2a3ml inflate la hawde l 3anser 9 2awl ma ybyno w 5azenoun w redlak l 3anser le ana 3mlteloun inflate  b object esmo vieholder nou3 l class le ana 3mlto fa hay l function b tem ested3e2a mara wa7de la kel 3onour mn haw 9 2awl mara byen3ard 3al shshe w btraje3le b kel mara object viewholder fe l 3anser l 5asa fe b2albo
//fa 2awl she ba3mlo b function l oncrate ba3ml object mn l viewholder le class le ana 3mlto heed l class moftarad t5azen fe l 3anser le badak ta3mloun inflate w howe bye5od parameter type View
//ya3ne l class le 3mlto ana mafroud y5azen l tasmem le 3mlto ana le howe title,wl numclub 2 textview
//fa houn abl ma 2a3ml object mn l viewholder howe bado y5zen tasmem fa lezm 2a3ml abl ma 2a3m object inflate la tasmem kolo w howe 7a yredele view w heed l view howe tsamem ta3ele sa3eta beb3tlo yeh la object l viewholder 3ashen y5azeno la heed tasmeme
//houn :        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view,parent,false); l context byeb3atole yeh ma3 l parent jeye ma3 l parent fa b2olo bas parent.getcontext()
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view,parent,false); hala2 houn mesh darore 7ot if view==null lesh l2no ana met2aked hay l method 7a testd3a mara wa7de 3end enshe2 la 2awl mara l 3anser l recycle view w 7a testad3a  bas la 9 item le bese3o 3al sheshe ba3d heek ma3ad tesd3a bas yen3aml scoroll 2aw she
//hala2 mnro7 ba3d ma ba3at tasmem le 3mlto ka parameter la viewholder class fa brou7  3a class l le 3mlto l viewholder b 3aref 2 textview l design le ana 3mlto w ba3ml findviewby id la 3anser le b2alb design le 3mlto
//fa bhay l 7ale 7a 5ale mara wa7de ya3mle inflate lala 3anser le jowa l design lesh ana 3mlt inflate 2awl mara w ba3den ba3ato la heed design lal class l viewholder w honek ana sta2blto w 3mlt findviwbyid lal 3anser le b2alb design
//        viewholder viewholder=new viewholder(view); heed l object la ytem enshe2o 9 marat la kel 3onour mn 3anser 9 b2alb l recycle view byensha2 2awl mara
//w e5er she braje3lo l viewholder :return viewholder; f3lyan 2awl ma ya3ml return lal view holder berj3lo yeh la function l onBindViewHolder wl onBindViewHolder byest2blo ka parameter

//hala2 ba3d ma yen3al create l oncrateviewholder 7a teb3at viewholder w onbindviewholder 7a test2blo ka parameter
//onBindViewHolder:btestad3a ba3d l oncrate , w btestad3a bas na3ml scroll
//ya3ne 2awl mara 3mlna crate lal 9 items bel recycle view w raj3t heed viewholder 7a raj3lo yeh lal onbindviewholder
//senario tene eno ana 3mlt scroll 7a testad3a bas l onbindviewholder
//onBindViewHolder:heye btesta3ml la t3abe bayanet data ta3el kel 3onour bteb3at viewholder ,l postion ta3el kel 3onour w enta 7asab l postion bt7ot data

//fa 2awl she hala2 ba3ml arraylist mno3 club
//w ba3den constructor
// fa 2awl she bjeeb object mn club 7asab l postion         club club=arrayList.get(position); mtl l getitem()
//ba3d heek b7ot data ta3el 2 textview w ana hawde 2 textview nbatole b parameter l viewholder




//summary:

/*
-2awl 3mlt class esmo RecycleViewAddapter w 5alyto ya3ml extend mn class recyleview.adapter RecycleViewAddapter extends RecyclerView.Adapter
-ba3d heed class RecyclerView.Adapter bye5od generic type vieholder le bado ne7fez fe findviewbyid ta3el design
-fa ba3ml class esmo vieholder w b5ale extend mn l Recycleview.viewholder 3ashen yefham eno l class heeed howe holder 3ashn 5azen fe ma3lomet w heed l class elo parameter bye5od View
-onCreateViewHolder:2awl she recycle view byestad3e bas mara wa7de function esma onCreateViewHolder la kel item b 2alb recycle view byen3ered mara wa7de bas la bas l item le bebyno 3al shshe bas w byestd3e la kel wa7de mara l onCreateViewHolder
-onCreateViewHolder:b2alb heed l function bade 2awl she 2a3l inflate lal design w ma 2no howe bas 7a yestd3e mara bas ma b7ot shart if view==nul
-onCreateViewHolder::ba3d heek ba3ml object mn l viewholder le class le 3mlto beb3atlo b2alb l parameter heed design w ba3ml return viewholder
-fa b class viewholder 7a yosalo design fa ana honek b3aref l 3anser ta3el design w ba3ml inflate la elon findviewby id bhay tare2a mesh kel mara 7a ya3ml findview by id mara wa7de
-ba3d heek onCreateViewHolder howe 7a yeb3at la function l onBindViewHolder l viewholder le 3mlo return w l onBindViewHolder byest2blo b l parameter
-onBindViewHolder:3ando parameter viewholder w l postion ta3el kel item b recycle view howe ma7al ma bade 3abe data hay l function btesd3a ba3d l oncrate w bel scroll 3ashen 8ayer data
-onBindViewHolder: ba3d ma 2a3ml arraylist w constructor bjee 3a hay l function bjeeb object data 7asab l postion ta3el kel item b 2alab recycle view         club club1=arrayList.get(position);
-onBindViewHolder: w b3abe data b2alb l 3anasr ta3el design ma howe ba3at viewhodler l oncrate fa b2alb heed l viewholder fe l 3anser ta3el deisgn l 2 textview bjeboun w b3ade data ta3loun



hala2 2awl she sha8lna l application ftered bsee3 10 3nser bas sheshe fa haw l 10 7a yesd3a la kel wa7de  l oncreateviewholder yen3aloun inflate w ba3d kel wa7de 7a tesd3a l onbindviewholder w yet3aba data
iza 3mlna onscroll down 7a te5tefe 3onouir masln  tesd3a bas l onvindviewholder ye5od data taba3 l 3onour l jdeed 7asab l postion  le eja jdeed w y7ot b2albo data ta3elo w ybyno

heed sho8l ta3el eno ya3ref aymta yestd3e kel method aymta ya3ref eno 5tafa 3onour aymta bas yestd3e l onbind aymta l oncreate heed she8l layoutmanager howe bedera kola



 */
//third step in clickl listner create object of this interface
//forth create method called setonclicklistenr and pass parameter itemclicklistenr  public void setclicklistener(ItemClickListener itemClickListener){
//        this.itemClickListener=itemClickListener;

//

//fifth on viewholder consturtor on itemview ma howe kel 3onour b2alb l recycled view howe  l item view make the method itemView.setOnClickListener(this); the original one and take it this and implement the View.OnClickListener then implimint the method onclick
public class RecycleViewAddapter extends RecyclerView.Adapter<RecycleViewAddapter.viewholder> {
    ArrayList<club> arrayList;
    public ItemClickListener itemClickListener;

    public void setclicklistener(ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    public RecycleViewAddapter(ArrayList<club> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view,parent,false);
        viewholder viewholder=new viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        club club1=arrayList.get(position);
        holder.title.setText(club1.getTitle_team());
        holder.num_cubs.setText(club1.getNum_cubs());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //holder class for recycle view
    class viewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title,num_cubs;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            num_cubs=itemView.findViewById(R.id.num_cubs);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(itemClickListener!=null){
                itemClickListener.onClick(v,getAdapterPosition());
            }
        }
    }
}

/*
sho sar bel zabt bel click listner :
2awl she 3mlna interface esmo itemclick listener w 3mlna method esma onclick bte5od view w integer esmo postion

ba3den jena 3al addapter 3mlna object meno la heeda l class l2no interface heed ma fena n2ol public ItemClickListener itemClickListener=new  ItemClickListener() ma fena heek
fena bas n3aref declare not intialize public ItemClickListener itemClickListener;
ba3den 3mlna function esma setonclicklistenr w 5alynee pass object mn l itemclcik listner w 3mlna intialize la heda l object         this.itemClickListener=itemClickListener;
lesh 3mlna function 3ashen bas badna na3ml click listner nestad3e hay l function

ba3den hala2 ne7na 3ana setonclicklistner l 3adeye fa mnrou7 3al l viwholder ok b2alb l constuctor fe itemview le howe l 3onsour ta3el kel wa7de bel recycled view
fa tare2a eno ne7na na3te setonclick listner la kel wa7de bel recycled view ba3den byetl3lna method b2alba mn3yet lal interface le 3mlne


hala2 keef badna na3te la kel wa7de bel recyceld view click listener

mmna3mel implimnt bel class l viewholder la interface esmo View.OnClickListener
ba3den mna3mel b2alb l constuctor     itemView.setOnClickListener(this);
fa bhay tare2a 3atet la kel wa7de bel recycled view click listener bta3ml overidelal method l onclick b2alb heeda l interface

fa byetla3lak mehod:

  public void onClick(View v) {
           }

fa hay l method aye wa7de bte5bous 3lyha bel recyceled view byen3aml run la hay l function

ba3den b2alb hay l method mn3yet lal function le 3mlta bel interface ta3ete     itemClickListener.onClick(v,getAdapterPosition());
fa le sar eno bas yen3aml run la setonclick listner l 3adeye ta3et system byen3aml run la hay l function

fa ne7na bas 2awl mara na3mel onCreateViewHolder fa ne7na 3am na3ml object mn l viewholder w na3te l view fa sa3eta bel constuctor la7la
byen3ml setonclicklistner ta3et system la7ala w byen3ata permission lal kel wa7de bel recyceld view eno 3anda method ta3et l setonclicklistener ta3et system ya3ne sar aye wa7de bte5bous 3lyha byen3aml run la onclick
fa b2alb hay l onlcik 3meel run la function ta3ete le bel interface le esma onclick w 3ateha l view ta3et setonclicklistner ta3et system le feha view le heye ta3et kel wa7de btekbousa


ba3den bel mainactivity bta3mel RecycleViewAddapter . byet3lk l method le 3mlneha le esma setclicklistener bna3teha this
w mna3ml implimnt lal method ta3et l interface le esma onclcik

ma enta bel viewholder bas 3mlt setonlciklistner b2alba 3ayat lal method le bel interface le esma onclick w 3atyta l view w l postion ta3et kel wa7de
fa enta bel method l 3ayatela bel main b2alba 3am ta3mel   this.itemClickListener=itemClickListener;

ne7na 2awl she 3mlna intefrface w 7atyna fe method esma onclick w ne7na metl ma mna3ref iza 3mlna implimnt la interface lezm ykoun fe b2albo kel l method le b2albo okkkk

ne7na 3mlna objet  mn heed l interface public ItemClickListener itemClickListener;
w ba3d ma 3mlna object 3mlna function eno hayde l function bte5od interface w joweta 3meel intilize eno ykoun bas t7ot b2alba interface tseer heed l interface equll lal interface le b2alb l addapter l howe ItemClickListener itemClickListener;

ok ba3den bel class l viwholder 3mlna implemnet la view.onclickloistner
ba3den 3mlna itmeview ya3ne aye wa7de bel recycleview.setonclicklistner(this) ya3ne this eno object mn l viewholder howe bnafs l a2t object mn l view.onclicklistner ma howe
l setonlciklistner bte5od parameter view.onclick listner fa enta bas 3mlt implemnt ka2nak 3am t2olo lal viewholder eno enta sort ka2no feek testa5dem 7alak ka object mn l viewholder 2aw objcte mn view.onclick listner
mtl wa7ad doctor w howe bnafs k wa2t parent fa bel mostshfa bekoun doctor w bel byt bekoun parent

ba3den ba3d ma 3mlna implemnet w heek 7a yseer 3ana kel l method le b2alb class le esmo view.onclicklistner le fe b2laba
bas function wa7de le heye onclcik

fa ne7na 2olna eno aye 7ada byekbous 3ala aye item bel recyeled view yen3aml run la l function le b2lab l interface l itemclciklistner

le sar ro7na 3ala l main activity 3mlna implement la itmeclciklistner fa 7ayseer 3ana l methods le b2lab w heye ma fe 8yer method wa7de b2lab le heye l onlcik

ba3den 3mlna         recycleViewAddapter.setclicklistener(this);

   recycleViewAddapter. l function le esma setonclicklistner le bte5od interface mn l itemclick listner fa ne7na 7atyna this
   this ma3neta mainactivity w howe 2ebela 3ade lesh l2no ne7na 3mlna implemnet bel mainactivity lal interface itemeclicklistner w 3mlna overide lal method l onclcik
   fa sar l mainactivity ka2no howe itemclicklistner w bnafs l wa2t howe mainactivity

   fa bhay l 7ale 3mlna  recycleViewAddapter.setclicklistener(this); le sar 3atyna l function le esma setclicklistener parameter main activity w b2lab hay l function byen3aml intilize
   fa le sar howe l itemclcik listner le b2lab l adapter saret equll mainactivity         this.itemClickListener=itemClickListener;

fa jez2 tene howe run
ne7na bas nekbous 3ala aye wa7de bel recyceld veiw 7a ya3ml run l setonclicklistner ta3et l anndoid fa ya3mel runlal onclick(View v) l method le b2laba
w bas yen3aml run 7a nshayek l itemclicklistner ta3etna msha8lae 3a 7ada 7ada 3mla acces yes l mainactivity
fa bma2no ne7na bas 3mlna recycleViewAddapter.setclicklistener(this) 3tyne this fa le 7anyseer
eni mainactivity.onClick(v,getAdapterPosition()); heye 7a yen3mla run w l implement ta3et hay l function ween mawjoude bel main activity
fa hay l function 7a yen3mla run bel mainactivity w yenb3tla l view ta3et l l recycledview w 7a yenb3at l postion ta3et kel wa7de bel recyled view

View v=v and int postion =getAdapterPosition()

fa 7a yen3aml run la hay l function w yetnafaz l implementation ta3ela b2lab l mainactivity

ya3ne na3mal call la hay                 mainactivity.onClick(v,getAdapterPosition()); w rou7 3ala l mainactivity ween ma3moula implemnet w b3atla l v,getAdapterPosition()
 rou7 nafezw limplemnet ta3ela mawjoud bel main activity


 feef ne7na masln mna3ml

 public void add(int x,int y){

 return x+y
 }

 ba3den mnrou7 mna3ml add(1,2)
 ya3ne ne7na ba3tna lparamnete 1,2

 houn heek she 3mlna call w ba3tna l v,addaptergetpostion()
                         






 */