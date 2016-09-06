package grooshbene.edcan.kr.todaysfeeling;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import io.github.yavski.fabspeeddial.FabSpeedDial;

/**
 * Created by bene on 2016. 6. 20..
 */
public class MapActivity extends ActionBarActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, FabSpeedDial.MenuListener {

    ArrayList<MarkerOptions> markersArray = new ArrayList<MarkerOptions>();
    Toolbar mToolbar;
    LinearLayout mFabBackground;
    FabSpeedDial mFabSpeedDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        mToolbar = (Toolbar)findViewById(R.id.mToolbar);
        mFabBackground = (LinearLayout)findViewById(R.id.fab_background);
        mFabSpeedDial = (FabSpeedDial)findViewById(R.id.mFabSpeedDial);
        setSupportActionBar(mToolbar);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mFabSpeedDial.setMenuListener(this);
    }





    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng spot1 = new LatLng(37.5009040,127.0257580);
        //127.0257580&y=37.5009040
        LatLng spot2 = new LatLng(37.4986671,127.0285215);
        //127.0285215&y=37.4986671
        LatLng spot3 = new LatLng(37.497929, 127.0265303);
        //x=127.0265303&y=37.4979429
        LatLng spot4 = new LatLng(37.4977844, 127.0286143);
        LatLng spot5 = new LatLng(37.4996741, 127.0280135);
        LatLng spot6 = new LatLng(37.4996571, 127.0271552);
        LatLng spot7 = new LatLng(37.4964140, 127.0279598);
        LatLng spot8 = new LatLng(37.4996741, 127.0280135);
        LatLng spot9 = new LatLng(27.4977844, 127.0286143);
        LatLng spot10 = new LatLng(37.4985675, 127.0280457);
        LatLng spot11 = new LatLng(37.4972993, 127.0297194);

        MarkerOptions m1=new MarkerOptions()
                .title("카페베네 강남대로점")
                .snippet("서울특별시 서초구 강남대로 429 ")
                .position(spot1)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_common_s));

        MarkerOptions m2=new MarkerOptions()
                .title("카페베네 강남역 A타워점")
                .snippet("서울특별시 강남구 테헤란로 105")
                .position(spot2)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_business_s));

        MarkerOptions m3 = new MarkerOptions()
                .title("카페베네 강남역점")
                .snippet("서울특별시 서초구 서초대로77길 3 아라타워 2층")
                .position(spot3)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_lover_s));

        MarkerOptions m4 = new MarkerOptions()
                .title("스타벅스 테헤란로점")
                .snippet("서울특별시 역삼동 서초 삼성타운")
                .position(spot4)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_common_s));

        MarkerOptions m5 = new MarkerOptions()
                .title("스타벅스 강남대로점")
                .snippet("서울특별시 서초구 강남대로 212")
                .position(spot5)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_family_s));

        MarkerOptions m6 = new MarkerOptions()
                .title("커피빈 강남역점")
                .snippet("서울특별시 역삼동 서초 삼성타운")
                .position(spot6)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_business_s));
        MarkerOptions m7 = new MarkerOptions()
                .title("파리바게트 강남역점")
                .snippet("서울특별시 서초구 서초대로64길 32")
                .position(spot7).icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_friends_s));
        MarkerOptions m8 = new MarkerOptions()
                .title("윙스터디 강남점")
                .snippet("서울특별시 서초구 강남대로 129")
                .position(spot8)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_friends_s));
        MarkerOptions m9 = new MarkerOptions()
                .title("파리바게트 강남대로점")
                .snippet("서울특별시 역삼동 서초 삼성타운")
                .position(spot9)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_lover_s));
        MarkerOptions m10 = new MarkerOptions()
                .title("강남역 카페도서관")
                .snippet("서울특별시 서초구 강남대로 21")
                .position(spot10)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_family_s));
        MarkerOptions m11 = new MarkerOptions()
                .title("강남역 윙스터디 2호점")
                .snippet("서울특별시 서초구 서초대로 21길 34")
                .position(spot11)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mk_common_s));
       markersArray.add(m1);
        markersArray.add(m2);
        markersArray.add(m3);
        markersArray.add(m4);
        markersArray.add(m5);
        markersArray.add(m6);
        markersArray.add(m7);
        markersArray.add(m8);
        markersArray.add(m9);
        markersArray.add(m10);
        markersArray.add(m11);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        googleMap.setMyLocationEnabled(true);
        for (int i=0; i<markersArray.size(); i++){
            googleMap.addMarker(markersArray.get(i));
            Log.e("asdf", markersArray.get(i).getPosition().toString());
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(spot10, 14));
        googleMap.setOnMarkerClickListener(this);

    }

    protected Marker createMarker(GoogleMap googleMap, LatLng latLng, String title, String snippet){

        return googleMap.addMarker(new MarkerOptions().position(latLng).title(title).snippet(snippet));
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Intent intent = new Intent(MapActivity.this, MapDialog.class);
        String title = marker.getTitle().toString();
        String snippet = marker.getSnippet().toString();
        intent.putExtra("title", title);
        intent.putExtra("snippet", snippet);
        startActivity(intent);
        return false;
    }

    @Override
    public boolean onPrepareMenu(NavigationMenu navigationMenu) {
        mFabBackground.setBackgroundColor(Color.argb(80,00,00,00));
        mFabBackground.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in));
        return true;
    }

    @Override
    public boolean onMenuItemSelected(MenuItem menuItem) {
        mFabBackground.setBackgroundColor(Color.argb(00,00,00,00));
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onMenuClosed() {
        mFabBackground.setBackgroundColor(Color.argb(00, 00, 00, 00));
//        mFabBackground.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out));
    }
}
