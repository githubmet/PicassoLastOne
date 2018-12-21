package hikmetanil.picassolastone;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import hikmetanil.picassolastone.adapter.P006ArrayAdapter;

public class P006FlowerNameOnPicture extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] flowerNames=getResources().getStringArray(R.array.flower_names);
        ArrayAdapter arrayAdapter=new P006ArrayAdapter(this,flowerNames);
        setListAdapter(arrayAdapter);
    }
}
