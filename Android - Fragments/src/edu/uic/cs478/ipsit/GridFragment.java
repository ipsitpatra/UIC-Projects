package edu.uic.cs478.ipsit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class GridFragment extends Fragment {
	
	private GridView gridView; // GridView
	private Fragment fullFragment = new ImageFragment(); //Image fragment using the image adapter
	private static String TAG = "GridFragment";
	
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    	/*manual inflation of the xml file*/
    	
    	View view = inflater.inflate(R.layout.grid_fragment, container,false);
    	gridView = (GridView) view.findViewById(R.id.grid_view);
		String[] images = getArguments().getStringArray("images");
    	gridView.setAdapter(new ImageAdapter(getActivity(), images));
    	return view;
    			
    }
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":onCreate()");
		super.onCreate(savedInstanceState);
	
		// Retain this Fragment across Activity reconfigurations
		setRetainInstance(true);
	
	}
	
	public boolean isVisib(){
		return fullFragment.isVisible();
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":onActivityCreated()");
		super.onActivityCreated(savedInstanceState);

		//Inflating the xml
		gridView = (GridView) getActivity().findViewById(R.id.grid_view);
		String[] images = getArguments().getStringArray("images");
    	gridView.setAdapter(new ImageAdapter(getActivity(), images));
	
		gridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				ImageAdapter i = (ImageAdapter)parent.getAdapter();
			    String obj = (String)i.getItem(position);
				Bundle bundle = new Bundle();
				bundle.putString("exact_image", obj);
				FragmentManager fm = getFragmentManager();
				FragmentTransaction ft = fm.beginTransaction();
				if(fullFragment.getArguments()!=null){
					fullFragment.getArguments().putAll(bundle);
				}else{
				fullFragment.setArguments(bundle);
				}
				ft.replace(R.id.change_frag, fullFragment,"FULL_IMAGE_FRAG");
				ft.addToBackStack(null);
				ft.commit();
			}
    		
		});
	}
}