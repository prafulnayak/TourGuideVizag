package org.sairaa.tourguidevizag;

public class TourPlace {
    private int imageId;
    //highlights are unique for each object
    private int highlights;
    //typeFragment is to distinguish objects for fragments.
    private int typeFragment;
    private String placeName,placeDesc, area, city, state;
    private String location;

    public TourPlace(){

    }

    public TourPlace(int imageId,int highlights,int typeFragment,
                     String placeName,String placeDesc,String area,
                     String city,String state,String location){

        this.imageId = imageId;
        this.highlights = highlights;
        this.typeFragment = typeFragment;
        this.placeName = placeName;
        this.placeDesc = placeDesc;
        this.area = area;
        this.city = city;
        this.state = state;
        this.location = location;


    }

    public int getImageId() {
        return imageId;
    }

    public int getHighlights() {
        return highlights;
    }

    public int getTypeFragment() {
        return typeFragment;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceDesc() {
        return placeDesc;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }
}
