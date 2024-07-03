package com.example.recycleview;

import android.view.View;

//firststep to make click listner in recycled view create interface
//w bna3mel function inside it called onclick w pass 2 parameter exmple view and postion of item
public interface ItemClickListener {
    void onClick(View view,int postion);
}
