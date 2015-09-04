package edu.uic.cs478.ipsit;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Project2ImageAdapter extends BaseAdapter{

	//List of Items containing the image information
    private List<Project2Item> items = new ArrayList<Project2Item>();
    private LayoutInflater layoutInflater;

    public Project2ImageAdapter(Context context)
    {
    	layoutInflater = LayoutInflater.from(context);

    	
    	//Setting items to hold image, text and URL
    	//Tag, Image id and URL
        items.add(new Project2Item("CR-Z", R.drawable.crz, "http://automobiles.honda.com/shop/cr-z.aspx"));
        items.add(new Project2Item("Aventador", R.drawable.aventador, "http://www.lamborghini.com/en/models/aventador-lp-700-4/overview/"));
        items.add(new Project2Item("FF", R.drawable.ff, "http://auto.ferrari.com/en_EN/sports-cars-models/car-range/ff/"));
        items.add(new Project2Item("Jaguarftype", R.drawable.jaguarftype, "http://www.jaguarusa.com/all-models/f-type/overview/index.html"));
        items.add(new Project2Item("Spider", R.drawable.spider, "http://auto.ferrari.com/en_EN/sports-cars-models/car-range/458-spider/"));
        items.add(new Project2Item("Accord", R.drawable.accord, "http://automobiles.honda.com/shop/accords.aspx"));
        items.add(new Project2Item("Vanquish", R.drawable.vanquish, "http://www.astonmartin.com/en-us/cars/the-new-vanquish"));
        items.add(new Project2Item("Malibu", R.drawable.malibu, "http://www.chevrolet.com/malibu-mid-size-sedan/build-your-own.html?x-zipcode=60544"));
        items.add(new Project2Item("Veneno", R.drawable.veneno, "http://www.lamborghini.com/en/masterpieces/veneno/overview/"));
        items.add(new Project2Item("Corvette", R.drawable.corvette, "http://www.chevrolet.com/corvette-sports-cars.html#"));
        items.add(new Project2Item("Boxter", R.drawable.boxter, "http://www.porsche.com/usa/models/boxster/boxster/"));
        items.add(new Project2Item("R8", R.drawable.r8, "http://www.audiusa.com/models/audi-r8"));
        items.add(new Project2Item("Veyron", R.drawable.veyron, "http://www.bugatti.com/en/veyron.html"));
        items.add(new Project2Item("Mustang", R.drawable.mustang, "http://www.ford.com/cars/mustang/?searchid=198686309|13927980149|15045740&ef_id=VKiWywAABW-spUCs:20150215060027:s"));
        items.add(new Project2Item("Impala", R.drawable.impala, "http://www.chevrolet.com/impala-full-size-cars/build-your-own.html?x-zipcode=60544"));
        items.add(new Project2Item("Camaro", R.drawable.camaro, "http://www.chevrolet.com/camaro-performance-cars.html"));
        items.add(new Project2Item("Cayenne", R.drawable.cayenne, "http://www.porsche.com/usa/models/cayenne/"));
        items.add(new Project2Item("Sl500", R.drawable.sl500, "http://www.mercedesbenzchicago.com/new/Mercedes-Benz/2014-Mercedes-Benz-SL-Class-Chicago-eb705d1d0a0a00642e157a969ecde6d9.htm"));
        
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i)
    {
        return items.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return items.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v = view;
        ImageView picture;
        TextView name;

        if(v == null)
        {
        	//Configuration from gridview_item.xml
           v = layoutInflater.inflate(R.layout.gridview_item, viewGroup, false);
           //Setting picture
           v.setTag(R.id.picture, v.findViewById(R.id.picture));
           //Setting picture name
           v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        //Binding to the View from Project2ImageHolder
        picture = (ImageView)v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);

        Project2Item item = (Project2Item)getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

   

}
