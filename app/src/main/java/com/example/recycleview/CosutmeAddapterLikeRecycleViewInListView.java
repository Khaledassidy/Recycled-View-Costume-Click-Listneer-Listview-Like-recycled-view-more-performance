package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


/*

bel list view la n2ool ne7na 3ana 9 items w shshe btsee3 49
fa 2awl she 7aykoun l if(convertview==null) inflate w ne7na 3ana class viewholder mna3mel meno object b2albo l viewholder b2albo 2 textview na3mloun inflate w baden mnsayfo b2alb l convert view bel settag(viewhodler)
ba3den ba3d ma nazalna shway
byeje l view 4 view 8ayroun tyeb haw l 4 le 2awl she ween bero7o berou7o 3ala matra7 metl l memory esmo recycled pool byetsayav fehoun haw l 4

so bas yeje l 4 view l jdeed
fa 2awl she beshof system 3ala receycled pool beshof fe she 3ana 3anser fayde fa yes fe b2albo 4 3aanser m5azanen bejeoboun fa l convert view ma7aykoun == null so heed satr ta3el layoutinfalter ma7ayen3amlo run bas byen3aml findviewby id lala 3anser
bas iza bade ana performance 2a3la mesh kel mara 2a3ml findview by id so ana 3mel class viewholder b2albo tnen textview
w ba3ml meno object 2awl she w b2ool if l (convertview==null) 3meel inflate rja3 3meel objct mn l viewholder w 3meel findviewby id la haw l tnen textview w rja3 heed l viewholder 3meel refernce meno le sar fe b2albo findviewby id bel convertview ya3ne 3meel settag(converview)
else gettag ya3ne jeeb haw l 3onsoureen le 3mlteloun find viewbyid

sa3eta sho 7ayseer 3ande 2awl she 4 3anser 2awl ma balesh 7a testad3e l getview l convertview ==null 3meel inflate la design w ba3den 3meel finviewby id w sayevoun b set tag w 3meel ya3ne kel she hawde
ba3den 3mlna scroll eja l 3onour l 5ames fa 7a yrou7 wa7ad menon bel recyceld pool yetsayv honek eja l 5ames 7a yshof system fe wa7ad fade so 7a yjebo w ma 7ykoun l converview=null wo 7ayrou7 3al else
7a ya3mel gettag l 7a yjeeb l viwholder le b2albo 3onsouren ma3mloen findviewbyid 7a yjeeb l 3onsouren le ma3molen finviewbyid

w ba3den kel mara 7a yeje w bay3mel settext lal view 7asab l postion



*/
public class CosutmeAddapterLikeRecycleViewInListView extends ArrayAdapter<club> {
    Context context;
    ArrayList<club> arrayList;
    int resource;
    public CosutmeAddapterLikeRecycleViewInListView(@NonNull Context context, ArrayList<club> arrayList, int resource) {
        super(context, resource,arrayList);
        this.context=context;
        this.arrayList=arrayList;
        this.resource=resource;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Nullable
    @Override
    public club getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        club club=getItem(position);
        Viewholder viewholder;
        if(view==null){
            LayoutInflater layoutInflater=LayoutInflater.from(getContext());
            view = layoutInflater.inflate(this.resource,parent,false);
            viewholder=new Viewholder();
            viewholder.textView1=(TextView) view.findViewById(R.id.title);
            viewholder.textView2=(TextView) view.findViewById(R.id.num_cubs);
            view.setTag(viewholder);

        }
        else{
            viewholder=(Viewholder)view.getTag();
        }
        viewholder.textView1.setText(club.getTitle_team());
        viewholder.textView2.setText(club.getNum_cubs());

        return view;
    }

    public class Viewholder{
        TextView textView1,textView2;

    }
}
