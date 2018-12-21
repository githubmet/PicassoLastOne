package hikmetanil.picassolastone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import hikmetanil.picassolastone.R;
import hikmetanil.picassolastone.transform.P006Transform;

public class P006ArrayAdapter extends ArrayAdapter {

    Context context;
    String[] flowerNames;
    public P006ArrayAdapter(Context context,String[] flowerNames){  //, int resource) {
        super(context, R.layout.p006custom_layout,flowerNames);
        this.context=context;
        this.flowerNames=flowerNames;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.p006custom_layout,parent,false);

        ImageView imageViewP006= view.findViewById(R.id.imageViewP006);

        Picasso.get()
                .load("http://services.hanselandpetal.com/photos/"+flowerNames[position])
                .resize(400,400)
                .transform(new P006Transform(flowerNames[position]))
                .into(imageViewP006);
        return view;//super.getView(position, convertView, parent);
    }
}
