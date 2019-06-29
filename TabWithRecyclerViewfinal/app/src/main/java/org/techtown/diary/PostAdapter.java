package org.techtown.diary;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private Context mContext;
    private StringBuffer stringBuffer;
    private JSONArray newjarray;



    public PostAdapter(Context context, JSONArray jsonArray){
        mContext=context;
        //stringBuffer= sb;
        newjarray=jsonArray;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View baseView = View.inflate(mContext, R.layout.phone_data,null);
        //????
        //phone data? in the video was post item
        PostViewHolder postViewHolder=new PostViewHolder(baseView);

        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        try {
            JSONObject newobject = newjarray.getJSONObject(position);
            holder.ivname.setText(newobject.getString("name"));
            holder.ivnumber.setText(newobject.getString("number"));
        }
        catch(JSONException e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return newjarray.length();
    }
}

