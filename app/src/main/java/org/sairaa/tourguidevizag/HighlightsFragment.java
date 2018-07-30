package org.sairaa.tourguidevizag;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import org.sairaa.tourguidevizag.constant;

import static org.sairaa.tourguidevizag.constant.BEACH;
import static org.sairaa.tourguidevizag.constant.HIGHLIGHTS;
import static org.sairaa.tourguidevizag.constant.PARK;

public class HighlightsFragment extends Fragment {
    private RecyclerView recyclerView, recyclerView2;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<TourPlace> tourPlaces, tourPlacesFragmentWise ;
    private int typeFragment;
    public HighlightsFragment(){

    }
    @SuppressLint("ValidFragment")
    public HighlightsFragment(int typeFragment){
        this.typeFragment = typeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        tourPlaces = new ArrayList<TourPlace>();
        addTourPlaces();


        View rootView = inflater.inflate(R.layout.highlights_activity, container, false);
        recyclerView = rootView.findViewById(R.id.recycle_view);
        recyclerView2 = rootView.findViewById(R.id.recycle_view2);
        tourPlacesFragmentWise = new ArrayList<TourPlace>();
//      Check the type fragment: or Highlights display 10 place
//      for others display desired
        if(typeFragment == HIGHLIGHTS){
            for (int i =0 ;i<Integer.parseInt(getString(R.string.ten));i++)
                    tourPlacesFragmentWise.add(tourPlaces.get(i));

        }else {
            for(int i = 0; i<tourPlaces.size();i++){
                    if(tourPlaces.get(i).getTypeFragment() == typeFragment){
                        tourPlacesFragmentWise.add(tourPlaces.get(i));
                    }
                }
        }
        adapter = new RecyclerAdapter(recyclerView2,tourPlacesFragmentWise,getActivity(),tourPlaces);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
//    int imageId,int highlights,int typeFragment,
//    String placeName,String placeDesc,String area,
//    String city,String state,String location)
    private void addTourPlaces() {
        tourPlaces.add(new TourPlace(R.drawable.kailashgiri,
                Integer.parseInt(getString(R.string.one)),
                Integer.parseInt(getString(R.string.one)),
                getString(R.string.kailash_giri),
                getString(R.string.kailash_giri_place_desc),
                getString(R.string.kailashgiri),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.kailash_giri_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.simhachalam,
                Integer.parseInt(getString(R.string.two)),
                Integer.parseInt(getString(R.string.four)),
                getString(R.string.shimanchal),
                getString(R.string.shimanchal_place_desc),
                getString(R.string.nad),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.shimanchal_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.rushikonda,
                Integer.parseInt(getString(R.string.three)),
                Integer.parseInt(getString(R.string.two)),
                getString(R.string.rushikonda_beach),
                getString(R.string.rushikonda_beach_place_desc),
                getString(R.string.rushikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.rushikonda_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.rkbeach,
                Integer.parseInt(getString(R.string.four)),
                Integer.parseInt(getString(R.string.two)),
                getString(R.string.rk_beach),
                getString(R.string.rk_beach_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.rk_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.novotel,
                Integer.parseInt(getString(R.string.five)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.novohotel),
                getString(R.string.novohotel_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.novohotel_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.tinati,
                Integer.parseInt(getString(R.string.six)),
                Integer.parseInt(getString(R.string.three)),
                getString(R.string.tinati_park),
                getString(R.string.tinati_place_desc),
                getString(R.string.kailashgiri),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.tinati_park_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.ramanaidu,
                Integer.parseInt(getString(R.string.seven)),
                Integer.parseInt(getString(R.string.three)),
                getString(R.string.ramanaidu_studio),
                getString(R.string.ramanaidu_studio_place_desc),
                getString(R.string.rushikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.ramanaidu_studio_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.vinayak,
                Integer.parseInt(getString(R.string.eight)),
                Integer.parseInt(getString(R.string.four)),
                getString(R.string.sampath_vinayak),
                getString(R.string.sampath_vinayak_place_desc),
                getString(R.string.siripuram),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.sampath_vinayak_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.submarine,
                Integer.parseInt(getString(R.string.nine)),
                Integer.parseInt(getString(R.string.six)),
                getString(R.string.submarine),
                getString(R.string.submarine_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.submarine_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.bheemili,
                Integer.parseInt(getString(R.string.ten)),
                Integer.parseInt(getString(R.string.two)),
                getString(R.string.bheemili_beach),
                getString(R.string.bheemili_beach_place_desc),
                getString(R.string.bheemli),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.bheemili_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.yarada,
                Integer.parseInt(getString(R.string.eleven)),
                Integer.parseInt(getString(R.string.two)),
                getString(R.string.yarada_beach),
                getString(R.string.yarada_beach_place_desc),
                getString(R.string.appikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.yarada_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.appikonda,
                Integer.parseInt(getString(R.string.twelfth)),
                Integer.parseInt(getString(R.string.two)),
                getString(R.string.appikonda_beach),
                getString(R.string.appikonda_beach_place_desc),
                getString(R.string.appikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.appikonda_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.fighterjet,
                Integer.parseInt(getString(R.string.thirteen)),
                Integer.parseInt(getString(R.string.six)),
                getString(R.string.fighterjet),
                getString(R.string.fighterjet_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.fighterjet_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.kanak,
                Integer.parseInt(getString(R.string.fourteen)),
                Integer.parseInt(getString(R.string.four)),
                getString(R.string.kanak_mahalaxmi),
                getString(R.string.kanak_mahalaxmi_place_desc),
                getString(R.string.jagadamba),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.kanak_mahalaxmi_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.vudapark,
                Integer.parseInt(getString(R.string.fifteen)),
                Integer.parseInt(getString(R.string.three)),
                getString(R.string.vuda_park),
                getString(R.string.vuda_park_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.vuda_park_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.thotlakonda,
                Integer.parseInt(getString(R.string.sixteen)),
                Integer.parseInt(getString(R.string.two)),
                getString(R.string.thotlakonda_beach),
                getString(R.string.thotlakonda_beach_place_desc),
                getString(R.string.rushikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.thotlakonda_beach_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.shibaji,
                Integer.parseInt(getString(R.string.seventeen)),
                Integer.parseInt(getString(R.string.three)),
                getString(R.string.sivaji_park),
                getString(R.string.sivaji_park_beach_place_desc),
                getString(R.string.kailashgiri),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.sivaji_park_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.fourpoints,
                Integer.parseInt(getString(R.string.eighteen)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.fourpoint),
                getString(R.string.fourpoint_beach_place_desc),
                getString(R.string.siripuram),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.fourpoint_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.daspalla,
                Integer.parseInt(getString(R.string.nineteen)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.daspalla),
                getString(R.string.daspalla_beach_place_desc),
                getString(R.string.jagadamba),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.daspalla_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.dolphin,
                Integer.parseInt(getString(R.string.twenty)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.dolphin),
                getString(R.string.dolphin_beach_place_desc),
                getString(R.string.jagadamba),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.dolphin_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.getway,
                Integer.parseInt(getString(R.string.twenty_one)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.gateway),
                getString(R.string.gateway_beach_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.gateway_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.thepark,
                Integer.parseInt(getString(R.string.twenty_two)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.thepark),
                getString(R.string.thepark_beach_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.thepark_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.vizagpalms,
                Integer.parseInt(getString(R.string.twenty_three)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.vizag_palms),
                getString(R.string.vizag_palms_beach_place_desc),
                getString(R.string.bheemli),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.vizag_palms_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.portstadium,
                Integer.parseInt(getString(R.string.twenty_four)),
                Integer.parseInt(getString(R.string.three)),
                getString(R.string.port_stadium_park),
                getString(R.string.port_stadium_park_place_desc),
                getString(R.string.siripuram),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.port_stadium_park_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.greenpark,
                Integer.parseInt(getString(R.string.twenty_five)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.greenpark),
                getString(R.string.greenpark_place_desc),
                getString(R.string.jagadamba),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.greenpark_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.zoo,
                Integer.parseInt(getString(R.string.twenty_six)),
                Integer.parseInt(getString(R.string.six)),
                getString(R.string.zoo),
                getString(R.string.zoo_place_desc),
                getString(R.string.bheemli),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.zoo_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.saipriya,
                Integer.parseInt(getString(R.string.twenty_seven)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.saipriya),
                getString(R.string.saipriya_place_desc),
                getString(R.string.rushikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.saipriya_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.vihar,
                Integer.parseInt(getString(R.string.twenty_eight)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.vihar),
                getString(R.string.vihar_place_desc),
                getString(R.string.rushikonda),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.vihar_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.novotelbheemili,
                Integer.parseInt(getString(R.string.twenty_nine)),
                Integer.parseInt(getString(R.string.five)),
                getString(R.string.novotel_resort),
                getString(R.string.novotel_resort_place_desc),
                getString(R.string.bheemli),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.novotel_resort_longitude_latitude)));
        tourPlaces.add(new TourPlace(R.drawable.aquarium,
                Integer.parseInt(getString(R.string.thirty)),
                Integer.parseInt(getString(R.string.six)),
                getString(R.string.aquarium),
                getString(R.string.aquarium_place_desc),
                getString(R.string.beach_road),
                getString(R.string.Vizag),
                getString(R.string.ap),
                getString(R.string.aquarium_longitude_latitude)));

    }
}
