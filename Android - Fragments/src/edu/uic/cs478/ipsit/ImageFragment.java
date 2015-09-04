package edu.uic.cs478.ipsit;


import java.io.InputStream;



import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment {
	
	private ImageView imageView;
	
	private  static  String TAG = "ImageFragment";

	//Image adapter is invoked
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {
	        // Inflate the layout for this fragment
	        //return inflater.inflate(R.layout.grid_fragment, container, false);
	    	View view = inflater.inflate(R.layout.full_image, container,false);
	    	imageView = (ImageView) view.findViewById(R.id.full_image_view);
	    	Bundle bundle = this.getArguments();
	    	String url = bundle.getString("exact_image");
	    	new DownloadImage(imageView).execute(url);
	    	return view;
	    			
	    }
	
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":onCreate()");
		super.onCreate(savedInstanceState);

		// Retain this Fragment across Activity reconfigurations
		setRetainInstance(true);
	
	}
	
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":onActivityCreated()");
		super.onActivityCreated(savedInstanceState);

//		imageView = (ImageView) getActivity().findViewById(R.id.full_image_view);
		
	}
	
	/*Download file */
	private class DownloadImage extends AsyncTask<String , Void, Bitmap>{
		ImageView bmImage;
		
		public DownloadImage(ImageView bmImage){
			this.bmImage = bmImage;
		}

		@Override
		protected Bitmap doInBackground(String... urls) {
			Bitmap mIcon11 = null;
			for(int i =0;i<urls.length;i++){
			String urldisplay = urls[i];
			
			try{
				InputStream in = new java.net.URL(urldisplay).openStream();
				mIcon11 = BitmapFactory.decodeStream(in);
			}catch(Exception e){
				Log.e("Error",e.getMessage());
				e.printStackTrace();
			}
			}
			return mIcon11;
		}
		
		protected void onPostExecute(Bitmap result){
			
			bmImage.setImageBitmap(result);
		}
	}
	
	
	

}
