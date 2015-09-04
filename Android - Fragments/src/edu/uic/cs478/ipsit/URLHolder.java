package edu.uic.cs478.ipsit;

public class URLHolder {
	/*Fragment urls*/
	
	/**
	 * @return the cars
	 */
	public static String[] getCars() {
		return cars;
	}

	/**
	 * @param cars the cars to set
	 */
	public static void setCars(String[] cars) {
		URLHolder.cars = cars;
	}

	/**
	 * @return the bikes
	 */
	public static String[] getBikes() {
		return bikes;
	}

	/**
	 * @param bikes the bikes to set
	 */
	public static void setBikes(String[] bikes) {
		URLHolder.bikes = bikes;
	}

	/**
	 * @return the places
	 */
	public static String[] getPlaces() {
		return places;
	}

	/**
	 * @param places the places to set
	 */
	public static void setPlaces(String[] places) {
		URLHolder.places = places;
	}
	
	private static String[] places = new String[]{
		"http://gaby.fachrul.com/img/gardendecoridea/gardening-ideas/gardening-ideas-find-the-latest-news-on-backyard-gardening-ideas550-x-373-100-kb-jpeg-x.jpg",
		"http://www.jfbclick.com/images/07Mines/Crown%20SQ.jpg",
		"https://trainwalkslondon.files.wordpress.com/2013/02/hp12-river-front_600x600_100kb.jpg",
		"http://thevietnamguide.com/tvg/karstenb/files/2012/08/P1070403_600x600_100KB.jpg",
		"http://www.historicjonesborough.com/lodging/images/10ViewfmLogHomeporch.JPG",
		"https://trainwalkslondon.files.wordpress.com/2014/04/t12-community-garden-in-matrimony-place_600x600_100kb.jpg"
		};
	
	
	private static String[] cars = new String[]{
			
			"http://1.bp.blogspot.com/-yTBASZ0i4r0/TyfjCjtiXGI/AAAAAAAACrQ/Kb3uYHE-DDc/s1600/Volkswagen-Phaeton-3.jpg",
			"http://s.petrolicious.com/2014/list/07-jul/Top10-cars-for-teens/top10-cars-for-teens-4.jpg",
			"http://www.desktopwallpaper2.com/desktop-wallpaper-home/2013-Skoda-Octavia-hd-wallpaper-hd-wallpaper-1366x768-6-50e020e52896f-9420.jpg",
			"http://www1.taazastat.com/99cars/auto_gallery/img100kb/cayenne_Front-angle.jpg","http://www2.taazastat.com/99cars/auto_resources/img100kb/model-dzire_1417414835dzire.jpg",
			"http://www1.taazastat.com/99cars/auto_gallery/img100kb/mobilio_Front_Angle.jpg",
			"http://wallpapers111.com/wp-content/uploads/2015/02/Car-Photos-HD-Download-2.jpg",
			"http://2.bp.blogspot.com/-PYHWVXMzoxU/Tj_kknOTyRI/AAAAAAAAG58/fNpEopXwj-k/s1600/Amazing-Cars-HD-wallpaper-+2.jpg"
			};
	
	private static String[] bikes = new String[]{
			
			"http://forum.motorcycle-usa.com/attach.aspx/14121/4.jpg","http://pirateslair.net/PICS_BMW_K1300S_2009_RS100KB.jpg",
			"http://i109.photobucket.com/albums/n55/jongu82/bikeandcar015.jpg",
			"http://lh3.ggpht.com/_huicIS8z4F4/Sb-C-DCfYcI/AAAAAAAAAB8/lai1779bA1g/s720/GarysBikeHDR.jpg",
			"http://www.kingracing.com/gossip/cockerill.jpg",
			"http://2.bp.blogspot.com/-iIygmTbq8wQ/U0Pg5_kpp1I/AAAAAAAAGLU/bVhEWhEo_00/s1600/Husqvarna-SM125-new-adventures-bikes.jpg"
			};
}
