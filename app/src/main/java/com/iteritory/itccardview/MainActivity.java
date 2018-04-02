package com.iteritory.itccardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.iteritory.itccardview.adapter.GroceryProductAdapter;
import com.iteritory.itccardview.model.Grocery;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private GroceryProductAdapter mAdapter;
    private List<Grocery> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        mRecyclerView = (RecyclerView) findViewById(R.id.idRecyclerView);
        //mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Populate the products
        mProductList = new ArrayList<>();
        mProductList.add(new Grocery("Mango",R.drawable.mango,"Rs. 150", "1 kg", "5"));
        mProductList.add(new Grocery("Pineapple",R.drawable.pineapple,"Rs. 250", "500 gm", "2"));

        //set adapter to recyclerview
        mAdapter = new GroceryProductAdapter(mProductList,this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
