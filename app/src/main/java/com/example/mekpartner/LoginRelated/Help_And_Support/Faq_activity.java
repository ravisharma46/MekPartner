package com.example.mekpartner.LoginRelated.Help_And_Support;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class Faq_activity extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_activity);

        ArrayList<FaqData> list = new ArrayList<>();

        mrecyclerView = findViewById(R.id.faqRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(layoutManager);

        madapter = new FaqAdapter(this,list);
        mrecyclerView.setAdapter(madapter);

        list.add(new FaqData("Service Vendor FAQs",1));

        list.add(new FaqData("1. Why should I get service through Mekvahan?\n",2));


        list.add(new FaqData("Mekvahan is an automobile service venture that aims at providing its outstanding assistance & services to all the two- & four-wheeler vehicle owners. It is an online two- & four-wheeler service provider aggregator platform that allows people to avail hassle-free, fast, affordable and quality services with transparency as the key factor. \n" +
                "Apart from enabling owners to have their cars serviced without leaving their homes or offices, Mekvahan is also trying to bring more transparency to the service and repair process by helping customers track the car service process in real time.“It is an alternative option where people end up paying 35-40 percent less for their automobile service than the authorised service stations.”\n" +
                "If you are already running a workshop or service center & seeking growth for your business then you should definitely join hands with us. Our strong team & business strategy will help both of us to take your business to a great height.\n",3));

        list.add(new FaqData("2. Who can tie up as a service vendor through Mekvahan?",2));

        list.add(new FaqData("If you are already running a workshop or service center & seeking growth for your business then you should definitely join hands with us.\n" +
                "Anyone providing best and quality certified services to customer is welcome. In order to start doing servicing through “Mekvahan”, you need to have the following:\n" +
                "i. GSTIN\n" +
                "ii. PAN Card (Personal PAN for business type “Proprietorship” and Personal + Business PLAN for business type as “Company”)\n" +
                "iii. GSTIN/TIN Number (not mandatory for few categories)\n" +
                "iv. Bank account and supporting KYC documents (Address Proof, and Cancelled cheque)\n" +
                "v. Minimum of 2 trained mechanics at their workshop.\n",3));

        list.add(new FaqData("3. What role will we play as a service provider?\n",2));

        list.add(new FaqData("Your first and utmost role is to provide the best and quality service for the customer. You have to ensure that every service done by you is matching the customer satisfaction or need. \n",3));

        list.add(new FaqData("4. Will the transactions take place from the vendor’s side?\n",2));

        list.add(new FaqData("No, the transactions will take place from “Mekvahan’s” side.\n",3));

        list.add(new FaqData("5. Do we have to perform repairing jobs 24/7 at Mekvahan?\n",2));

        list.add(new FaqData("You do not need to perform repairing jobs 24/7, but if you are the SOS vendor of Mekvahan then you have to be ready to perform 24/7 job*.\n",3));

        list.add(new FaqData("(Not every SOS partner have to fulfil this, depend upon the customer & mekvahan needs.)\n",2));

        list.add(new FaqData("7. Do we have to stop servicing for our regular customers?\n",2));
        list.add(new FaqData("No, you can continue with your existing customers.\n",3));

        list.add(new FaqData("8. How Mekvahan will increase my existing business?\n",2));

        list.add(new FaqData("Join Mekvahan- India’s fastest growing bike & car service and maintenance network. Our partnership program gives you the right push towards a more rewarding and profitable venture as an independent garage. Get quality leads through our various channels and earn great incentives on serving our customer base. We will also support you with digital outreach, promotional collaterals and brand awareness campaigns. Unlock limitless possibilities.\n" +
                "We will give you all the technical support you need, from customer management, garage operations to invoicing and billing.\n" +
                "Through our centralised spare parts inventory management and a vast network of vendors and dealers, we will take care of all your spares and consumable needs.\n" +
                "We will give your business the exposure it deserves. With our extensive branding and promotional campaigns, we’ll help you increase visibility and brand value of your garage.\n" +
                "Put your business in overdrive. Get the best returns from your investment. Make profits and earn the greatest amongst the competition. You have the place; we have a plan!\n",3));
        list.add(new FaqData("9. What is our payment mode of settlement?\n",2));

        list.add(new FaqData("The payment mode of settlement is via online mode (NEFT; IMPS; UPI).  All the payment will be settled at the end of the 4th day of the delivered service.\n",3));

        list.add(new FaqData("10. How I will receive service?\n",2));

        list.add(new FaqData("You will receive service through our partner app or partner web by login the partner credentials. \n",3));

        list.add(new FaqData("11. Who decides the price of the services?\n",2));

        list.add(new FaqData("As a service provider, price & quality controller, we the “Mekvahan” will set the price of all the services listed on our platform.\n",3));

        list.add(new FaqData("12. How do I service through Mekvahan?\n",2));

        list.add(new FaqData("You will receive service information through our partner app or partner web by login the partner credentials. \n" +
                "To confirm the  service; the app notifications are sent to the respective service vendors who has “Toggled on” their available to accept services.\n" +
                "If you don't want to avail any services and you haven't turned off the toggle button and in the meanwhile you receive any service then you must inform the customer support and get it cancelled ASAP. In case, if it's taking more time to cancel or you aren't able to cancel then you need to pay for it as a fine.\n",3));
        list.add(new FaqData("13. What are the documents required to register as a service partner on mekvahan?\n   ",2));

        list.add(new FaqData("i. GSTIN\n" +
                "ii. PAN Card (Personal PAN for business type “Proprietorship” and Personal + Business PLAN for business type as “Company”)\n" +
                "iii. GSTIN/TIN Number (not mandatory for few categories)\n" +
                "iv. Bank account and supporting KYC documents (Address Proof, and Cancelled cheque)\n" +
                "v. Minimum of 2 trained mechanics at their workshop.\n",3));

        list.add(new FaqData("14. Who takes care of the delivery of the vehicles ?\n",2));


        list.add(new FaqData("Mekvahan will be responsible for the delivery of the vehicles, but the service partners  have to provide details of their delivery mechanics in case of any emergency pickup & drop off when “Mekvahan” will not be reliable for the pickup & delivery & the payment for free services like Pickup or Drop-off (If any).\n" ,3));

        list.add(new FaqData("15. How and when will I get paid?\n",2));

        list.add(new FaqData("All the payment will be settled at the end of the 4th day of the delivered service.\n",3));
        list.add(new FaqData("16. When can I start serving the vehicles?\n",2));

        list.add(new FaqData("After completion of all the documentation process and successfully creating your partner id on our web or mobile app you are ready to start servicing or ready to receive services.\n",3));

        list.add(new FaqData("17. What is Commission fee and how much commission is charged?\n",2));

        list.add(new FaqData("It depends upon vendor to vendor because some vendors are providing  one kind of service, while another is providing an other kind of service. That's why it is not fixed. \n",3));

        list.add(new FaqData("18. How do I list my services on Mekvahan?\n",2));

        list.add(new FaqData("We have a predefined service which is showing on our mobile app or web or if, you have to list down new services category which is not available to our portal then you will have to contact us through our support team and we will update your new service on our portal asap.\n",3));

        list.add(new FaqData("19. How do I manage my services on mekvahan?\n",2));

        list.add(new FaqData("You can manage the services on mekvahan by using the mobile app or the partner’s web.\n",3));

        list.add(new FaqData("20. What protection does Mekvahan offer in case of lost/damaged vehiles and fraudulent customer claims?\n",2));

        list.add(new FaqData("The service centre has to ensure safety and quality service of the vehicle.  In case of any type of damage or theft of the vehicle,  the service centre will be liable for it.\n",3));

        list.add(new FaqData("21. Would I have to compensate if the customer has not satisfied with the availed service or i have to do the job again?\n",2));

        list.add(new FaqData("If the customer is not satisfied with your service or he/she claimed for compensation then our inspection team will verify & check every availed service in detail provided by you and if found as not done properly or you have used a duplicate or  fraudulent product which is not mentioned on our service listing then you have do that job again or replace that part or if not then you have to compensate for the same according to our customer protection policy.\n",3));

        list.add(new FaqData("22. Would I get compensation if the customer has replaced the original parts or particulars with a different item and claim for refund?\n",2));
        list.add(new FaqData("Yes, you can raise a claim through Seller Protection Fund. Depending on the case and category, you will be given a refund provided if you have adequate proof that you replace the right product. This will may help us close the dispute in your favour.\n",3));

        list.add(new FaqData("How Can You Offer 40% Savings On Services? \n",2));



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
