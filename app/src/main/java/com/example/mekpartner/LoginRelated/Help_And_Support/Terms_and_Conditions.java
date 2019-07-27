package com.example.mekpartner.LoginRelated.Help_And_Support;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class Terms_and_Conditions extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and__conditions);

        ArrayList<TermsData> list = new ArrayList<>();

        mrecyclerView = findViewById(R.id.termsRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(layoutManager);

        madapter = new TermsAdapter(this,list);
        mrecyclerView.setAdapter(madapter);

        list.add(new TermsData("Terms & Conditions",10));
        list.add(new TermsData("1. The service centre has to give an instant confirmation as soon as you receive a service request from the customer. \n" +
                "\n" +
                "2. The person, who will go to pick up and drop the vehicle, has to wear the Mekvahan’s merchandise along with a valid ID card. \n" +
                "\n" +
                "3. Mekvahan will not be reliable for paying for free services like Pickup or Drop-off (If any) etc.\n" +
                "\n" +
                "4. The service centre has to ensure safety and quality service of the vehicle.  In case of any type of damage or theft of the vehicle,  the service centre will be liable for it. \n" +
                "\n" +
                "5. There will be by default guarantee of serviced work for 48 hours or 200 km, within this criteria service centre won't be able to charge for the same work. If service centre denies then it has to refund for the service to the customer. \n" +
                "\n" +
                "6. All the payment will be settled at the end of the 4th day of the delivered service.\n" +
                "\n" +
                "7. In case of any legal dispute between the service centre and the customer, Mekvahan will not be liable for bearing cost but will do all the possible things to settle down the dispute. \n" +
                "\n" +
                "8. Mekvahan will not help the service centre in case of misbehaviour or molestation with female customers and will take legal action against the molesters.\n" +
                "\n" +
                "9. If any service centre harms the brand image or reputation of Mekvahan then the latter will always be free to cancel the tie-up agreement.\n" +
                "\n" +
                "\n" +
                "10. It is the duty and responsibility of service centre to satisfy customer needs. It has to ensure that the vehicle must be serviced & delivered on time. \n" +
                "For this the service centre may even get bonus on monthly basis. \n" +
                "\n" +
                "11. Payment related problems  will be resolved within 15 working days. \n" +
                "\n" +
                "12. We reserve the right to change our Terms and Conditions at any time.\n" +
                "\n" +
                "13. If you don't want to avail any services and you haven't turned off the toggle button and in the meanwhile you receive any service then you must inform the customer support and get it cancelled ASAP. In case, if it's taking more time to cancel or you aren't able to cancel then you need to pay for it as a fine.\n" +
                "\n" +
                "\n" +
                "\n" +
                "14. You have to fix or use only those parts & particulars which is mentioned by us (strictly according to the inventory list provided by mekvahan) if not then a huge fine will be imposed.\n" +
                "\n" +
                "15. You have to fulfil all the checklist particulars available with any service booked via mekvahan application.\n" +
                "\n" +
                "16. The particular service vendor first checks and confirms whether there is an availability of servicing on provided day or not as well as Service Vendor is capable of giving particular service of that brand or not or Parts & Particulars of that particular service is available with him or not.\n" +
                "\n" +
                "17. We will deduct Few coins in your wallet after accepting any service and it will refund to you when you received your weekly payment or settled down in your weekly payment.\n",2));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
