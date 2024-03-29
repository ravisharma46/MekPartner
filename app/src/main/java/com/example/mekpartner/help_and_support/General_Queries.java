package com.example.mekpartner.help_and_support;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mekpartner.R;

import java.util.ArrayList;

public class General_Queries extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__queries);

        ArrayList<General_Queeries_data> list = new ArrayList<>();

        mrecyclerView = findViewById(R.id.queriesRecyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(layoutManager);

        madapter = new General_queries_adapter(this, list);
        mrecyclerView.setAdapter(madapter);

        list.add(new General_Queeries_data("Mek General Queries\n", 1));

        list.add(new General_Queeries_data("1. Background", 2));

        list.add(new General_Queeries_data("\n1. This document is an electronic record in terms of (i) Information Technology Act, 2000; (ii) the rules framed there under as applicable; and (iii) the amended provisions pertaining to electronic records in various statutes as amended by the Information Technology Act, 2000. This electronic record is generated by a computer system and does not require any physical or digital signatures.", 3));

        list.add(new General_Queeries_data("\n2. This document is published in accordance with the provisions of Rule 3 (1) of the Information Technology (Intermediaries guidelines) Rules, 2011 that require publishing the rules and regulations, privacy policy and Terms of Use for access or usage of the Platform (defined below).", 3));

        list.add(new General_Queeries_data("\n3. Mekvahan (“Web application/Website or app”) and http://mekvahan.com/ (“Website”) together referred to as “Platform”, is owned, registered and operated by UDYAMAT MA VIRAMASVA PVT LTD (\"Company\"), a private limited company, incorporated under the provisions of the Companies Act, 2013, and having its principal place of business at Aya Nagar, Delhi.", 3));

        list.add(new General_Queeries_data("\n4. These terms of usage (“Terms of Use”) govern your use of the Platform and services (as defined below) as aggregated through the Platform. By using or visiting our Platform, or by using any services aggregated through the Platform, You shall be deemed to have read, understood and accepted to be bound by these Terms of Use.", 3));

        list.add(new General_Queeries_data("\n5. For the purpose of these Terms of Use, wherever the context so requires “Your” or “User” shall mean any natural person who uses the Platform for availing the services. The term “We”, “Us”, “Our” shall mean the Company, its employees, and authorised agents that perform any services on the Company’s behalf.", 3));

        list.add(new General_Queeries_data("\n6. We reserve the right to make changes to these Terms of Use at any time. Any such modifications will become effective immediately upon posting to the Platform and your continued use of the Platform, and/or the services aggregated through the Platform constitutes your agreement to such modifications. You agree to periodically review the current version of these Terms of Use as posted on the Platform.", 3));

        list.add(new General_Queeries_data("\n2. services", 2));

        list.add(new General_Queeries_data("\n1. We are service aggregators and through our Platform, We enable the User(s) to receive car/bike related repairs, services and maintenance and also roadside assistance including quick check-up, key lock- out, car/bike servicing etc. (“services”), from third party workshops and their authorized personnel (“Service Provider”), under agreement with Us on a real time basis. These services are made available to You for Your personal, non-commercial use.", 3));

        list.add(new General_Queeries_data("\n2. For the purposes of these Terms of Use,", 3));

        list.add(new General_Queeries_data("\na. “Applicable Law” shall mean any statute, law, regulation, ordinance, rule, judgment, notification, rule of common law, order, decree, bye-law, government approval, directive, guidelines, requirements or other governmental restriction, or any similar form of decision of, or determination by, or any interpretation, policy or administration, having the force of law of any of the foregoing, by any Authority having jurisdiction over the matter in question, whether in effect as of the date of these Terms of Use or thereafter.\n", 3));

        list.add(new General_Queeries_data("b. “Authority” shall mean any national, state, provincial, local or similar government, governmental, regulatory or administrative authority, branch, agency, any statutory body or commission or any non-governmental regulatory or administrative authority, body or other organization to the extent that the rules, regulations and standards, requirements, procedures or orders of such authority, body or other organizations that have the force of Applicable Law or any court, tribunal, arbitral or judicial body in India.", 3));

        list.add(new General_Queeries_data("\nc. “Minimum Age” shall mean any person aged 18 (Eighteen) years and above.", 3));

        list.add(new General_Queeries_data("\n2. In order to avail the services aggregated through the Platform, the User(s) must download the Mobile App and mark the location at which they would like the Service Provider to arrive and provide the requisite Service.", 3));

        list.add(new General_Queeries_data("\n3. The User(s) shall then be required to select the Service they would like to be provided by the Service Provider (“Service Request”), register themselves and their vehicle on the Platform, and verify their registration.", 3));

        list.add(new General_Queeries_data("\n4. You agree, inter alia, to provide true, accurate, current and complete information about yourself and the vehicle, as prompted by the Platform registration form. If you provide any information that is untrue, inaccurate, not current or incomplete or We have reasonable grounds to suspect that such information is untrue, inaccurate, not current, incomplete or that You are misusing the Platform in any manner, We reserve the right to indefinitely suspend, terminate or block access to the Platform and the services aggregated through the Platform.", 3));

        list.add(new General_Queeries_data("\n5. The User(s) shall then be required to ‘confirm’ their Service Request, and upon such confirmation of the Service Request by the User and acceptance of the same by the Service Provider, the Platform shall provide the details of the Service Provider to the User on a real time basis.", 3));

        list.add(new General_Queeries_data("\n6. Cancellation of Service Request: The User(s) can cancel a Service Request within 5 (five) minutes of making such a Service Request, on the Platform. In the event the User wishes to cancel a Service Request raised, after the expiry of 5 (five) minutes as mentioned above, the User shall be required to call on the +91 7838878899 to cancel such Service Request. Further, if a User cancels 3 (three) or more Service Requests by calling the customer care number as provided herein, We reserve the right to indefinitely suspend, terminate or block access of such User to the Platform and the services aggregated through the Platform.", 3));

        list.add(new General_Queeries_data("\n3. Platform to connect the Service Providers and Users", 2));

        list.add(new General_Queeries_data("\n1. We do not provide any services under these Terms of Use, We merely act as a facilitator/aggregator between the Service Providers and the Users, for availing the services through the Service Provider. These Terms of Use should not be construed in any way to mean that We provide such services herein.", 3));

        list.add(new General_Queeries_data("\n2. We do not make any representation or warranty as to the quality of the services to be provided by the Service Provider to the User. We do not accept liability for any errors or omissions committed by the Service Provider or their authorised personnel.", 3));

        list.add(new General_Queeries_data("\n3. We are not responsible for any inadequate performance or non-performance of the services by the Service Provider. We shall not be required to mediate or resolve any dispute or disagreement between Service Provider(s) and the User(s).", 3));

        list.add(new General_Queeries_data("\n4. The Service Providers are not employees or agents of the Company and the Company shall not be held liable for their actions or inactions.", 3));

        list.add(new General_Queeries_data("\n4. Representations, Warranties and Obligations of the Platform\n", 2));

        list.add(new General_Queeries_data("1. We hereby represent and warrant that:", 3));

        list.add(new General_Queeries_data("\na. We are a duly registered company as under the relevant provisions of the Companies Act, 2013;", 3));

        list.add(new General_Queeries_data("\nb. We are in compliance with the Applicable Law to provide services, subject to these Terms of Use;", 3));

        list.add(new General_Queeries_data("\nc. We will comply with the Privacy Policy and ensure data security of the Users at all times.\n", 3));

        list.add(new General_Queeries_data("2. Representations, Warranties and Obligations of the User", 2));

        list.add(new General_Queeries_data("\n1. You hereby represent and warrant that:", 3));

        list.add(new General_Queeries_data("\na. You are a natural person, of the Minimum Age, competent to contract, have read, understood and agree to be bound by these Terms of Use;", 3));

        list.add(new General_Queeries_data("\nb. You shall comply with and fully adhere to these Terms of Use;", 3));

        list.add(new General_Queeries_data("\nc. You shall provide accurate information and details about yourself and the vehicle, when prompted by the Platform registration form;", 3));

        list.add(new General_Queeries_data("\nd. You shall fulfill Your payment obligations for availing the services through the Platform.", 3));

        list.add(new General_Queeries_data("\n2. Intellectual Property Rights", 2));

        list.add(new General_Queeries_data("\n1. Copyright", 3));

        list.add(new General_Queeries_data("\n1. All content included on the Platform, including but not limited to, text, graphics, logos, designs, photographs, button icons, images, video clips, digital downloads, data compilations etc.is Our property and is protected by the Applicable Laws with respect to intellectual property rights. We reserve the right to terminate Your engagement with Us, if We, in Our sole and absolute discretion, believe that You are in violation of this clause.", 3));

        list.add(new General_Queeries_data("\ni. The content made available on or via the Platform, is provided to You ‘AS IS’ for Your information and personal use only and may not be used, copied, reproduced, distributed, transmitted, broadcast, displayed, sold, licensed, or otherwise exploited for any other purpose whatsoever without Our prior written consent. We reserve all rights not expressly granted in and to the Platform.", 3));

        list.add(new General_Queeries_data("\n2. Trademarks", 3));

        list.add(new General_Queeries_data("\n1. http://mekvahan.com/ is the domain of the Company. The Platform, including, but not limited to its graphics, logos, page headers, button icons, scripts and service names constitute trade dress of the Company. The trademarks, domain names and trade dress of the Company shall not be used or reproduced without prior written approval from the Company, and may not be used in connection with any product or service that is not affiliated with the Company.", 3));

        list.add(new General_Queeries_data("\n2. Links", 2));

        list.add(new General_Queeries_data("\n1. The Platform may contain links to other websites (\"Linked Sites\"). The Linked Sites are not under the control of the Company. We are not responsible for the content of any Linked Site, including, without limitation to, any link contained in a Linked Site, or any changes or updates to a Linked Site.", 3));

        list.add(new General_Queeries_data("\n2. We are not responsible for any form of transmission, whatsoever, received by the User from any Linked Site. We are providing these links only for convenience, and the inclusion of any such link does not imply endorsement by the Company, of the Linked Sites or any association with its operators or owners including the legal heirs or assigns thereof.", 3));

        list.add(new General_Queeries_data("\n3. On accessing the Linked Sites, You shall be governed by the terms of use, privacy policy and such other additional policies of the Linked Sites. You further acknowledge and agree that We shall not be responsible or liable, directly or indirectly, for any damage or loss caused or alleged to be caused by or in connection with the use of or reliance on any such content, advertising, products, services or other materials available on or through any Linked Sites or for any errors, defamatory content, libel, slander, omissions, falsehoods, obscene content, pornographic material, or any profanity contained therein.", 3));

        list.add(new General_Queeries_data("\n3. Advertisement Links", 2));

        list.add(new General_Queeries_data("\n1. The Platform may contain links to various advertisements (“Advertisement Site”). The Advertisement Site is not under the control of the Company. We are not responsible for the content on any Advertisement Site, including, without limitation to, any link contained in the Advertisement Site, or any changes or updates to the same.", 3));

        list.add(new General_Queeries_data("\n2. These Advertisement Site(s) shall be construed to be Linked Sites (as mentioned above) and the provisions of Clause 7 above shall apply for Advertisement Site(s).", 3));

        list.add(new General_Queeries_data("\n4. User feedback/comments/ suggestions", 2));

        list.add(new General_Queeries_data("\n1. While rating/ submitting/ posting comments/ suggestions/ opinions/ feedback etc. (“User Feedback”), the User agrees and acknowledges that:", 3));

        list.add(new General_Queeries_data("\na. The User Feedback does not contain any confidential information or is not in violation of any third party rights including intellectual property rights;", 3));

        list.add(new General_Queeries_data("\nb. The User Feedback shall not be unlawful, obscene, defamatory, libelous, threatening, pornographic, harassing, hateful, racially or ethnically offensive, or is otherwise inappropriate;", 3));

        list.add(new General_Queeries_data("\nc. We are not under any obligation of confidentiality, express or implied, regarding the User Feedback;", 3));

        list.add(new General_Queeries_data("\nd. We reserve the right to use or disclose such User Feedback for any purpose, in any way, as We deem fit;", 3));

        list.add(new General_Queeries_data("\ne. By posting/ submitting User Feedback, the same shall become our intellectual property right without any obligations including but not limited to any compensation or consideration, express or implied to You.", 3));

        list.add(new General_Queeries_data("\n2. Payment Terms", 2));

        list.add(new General_Queeries_data("\n1. User(s) can may make payment through one of the following available options, for availing the services through the Platform (“Service Fee”):", 3));

        list.add(new General_Queeries_data("\na. Internet Banking;\n", 3));

        list.add(new General_Queeries_data("b. Credit/ Debit Card;\n", 3));

        list.add(new General_Queeries_data("c. Paytm Wallet; or\n", 3));

        list.add(new General_Queeries_data("d. Cash Payments.\n", 3));

        list.add(new General_Queeries_data("2. The User agrees and accepts that the costs for spare parts shall be payable separately, over and above the Service Fee (“Spare Part Cost”). The Service Provider shall provide a receipt for such Spare Part Costs, at actuals.\n", 3));

        list.add(new General_Queeries_data("3. The User agrees and accepts that all nuances and modalities relating to making payment using Internet Banking/ Debit/Credit Cards/ Paytm Wallet (“Virtual Payment Mode”) shall be separately governed by arrangement(s) / terms and conditions between You and the relevant banks/ Paytm Wallet. We shall not be responsible, in any manner whatsoever, for any liability that may arise in relation to the Virtual Payment Modes (including any fraudulent transaction).\n", 3));

        list.add(new General_Queeries_data("4. While availing any of the payment method(s) available on the Platform, We will not be responsible or assume for any liability, whatsoever in respect of any loss or damage arising directly or indirectly to You due to (a) Lack of authorization for any transactions; (b) Any payment issues arising out of the transaction or (c) Decline of such transaction for any reason.", 3));

        list.add(new General_Queeries_data("\n5. You understand, accept and agree that the payment facility provided by Us, is neither a banking nor financial service but is merely a facility for providing an automated online electronic payment, collection and remittance for the transactions between the Users and the Service Providers, on the Platform using the existing authorized banking infrastructure and payment gateway networks. Further, by providing a payment facility, We are neither acting as trustees nor acting in any fiduciary capacity with respect to the payments made by the User for availing the services on the Platform.", 3));

        list.add(new General_Queeries_data("\n6. We reserve the right to refuse to process any request for Service availed by a User with a prior history of questionable charges including without limitation, breach of any agreements by such User with Us, or breach/violation of any Applicable Law.", 3));

        list.add(new General_Queeries_data("\n7. GST or any other applicable taxes shall be borne by the User.\n", 3));

        list.add(new General_Queeries_data("2. Privacy\n", 3));

        list.add(new General_Queeries_data("3. Fraud and Improper Conduct\n", 3));

        list.add(new General_Queeries_data("1.You may only access the Platform and use the services for lawful purposes. You are solely responsible for the knowledge of and adherence to any and all provisions of Applicable Law pertaining to Your use of the services. You agree that You will not in any way:\n", 3));

        list.add(new General_Queeries_data("a. Interfere with the ability of others to access or use the Platform and the services aggregated through the Platform;\n", 3));

        list.add(new General_Queeries_data("b. Disrupt the normal flow of communication or otherwise act in a manner that adversely affects other Users' ability to use the Platform or the services;\n", 3));

        list.add(new General_Queeries_data("c. Interfere with or disrupt the services or servers or networks connected to the services, or disobey any requirements, procedures, policies, or regulations of networks connected to the services;\n", 3));

        list.add(new General_Queeries_data("d. Upload or post or transfer, any content or other material that contains or constitutes viruses, Trojan horse or other code with malicious, disruptive and/or destructive features;\n", 3));

        list.add(new General_Queeries_data("e. You shall not attempt to interfere with any other User’s use of the Platform or the services aggregated through the Platform;\n", 3));

        list.add(new General_Queeries_data("f. You shall not use any false or misleading information (e.g., false or misleading names, email addresses or URLs) when using the Service, including, without limitation, with respect to any identifying information about yourself, and all the information that You provide must be accurate and correct.\n", 3));

        list.add(new General_Queeries_data("2. Limitation and Disclaimer of Warranty\n", 2));

        list.add(new General_Queeries_data("1. The Platform, the services and each portion thereof are provided \"AS IS\" without warranties of any kind either expressed or implied. To the fullest extent possible pursuant to Applicable Law, We disclaim all warranties, express or implied, with respect to the Platform, the services and each portion thereof, including, but not limited to, non-infringement or other violation of intellectual property rights.\n", 3));

        list.add(new General_Queeries_data("2. We do not warrant or make any representations regarding the use, validity, accuracy, or reliability of the Platform.\n", 3));

        list.add(new General_Queeries_data("3. We do not warrant or make any representations that the Platform shall (i) meet Your requirements or reliable; (ii) be uninterrupted, timely, secure or error-free; (iii) rectify any errors found on the Platform’s software. Further, access to the Platform shall be contingent to Your internet accessibility and We shall not be held liable for any lack/ sporadic breaks in Your internet accessibility.\n", 3));

        list.add(new General_Queeries_data("4. We shall not be liable in the event any damage or loss occurs to your computer system, or any other electronic device, or any data as a result of downloading the Mobile App or visiting the Website.\n", 3));

        list.add(new General_Queeries_data("We do not warrant or make any representations regarding the reliability, suitability or quality of the Service provided by the Service Provider.\n", 3));

        list.add(new General_Queeries_data("6. We shall not be liable for any loss or damages suffered by the User due to performance or non-performance of the services by the Service Provider. Further, We shall not be liable for any loss or damage suffered, on account of any fault, willful misconduct or negligence on the part of the Service Provider\n", 3));

        list.add(new General_Queeries_data("7. We shall not be liable for any direct, indirect, incidental or consequential damages whatsoever incurred by the User due to use of the services or due to the non- availability of the Platform or the services.\n", 3));

        list.add(new General_Queeries_data("8. If You are dissatisfied or harmed by the Platform or anything related with the Platform, Your sole remedy shall be to terminate these Terms of Use by uninstalling the Mobile App or by leaving the Website.\n", 3));

        list.add(new General_Queeries_data("We shall be entitled to disclose to the Authority, as required by Applicable Law or by any directive or request from any government body, the particulars of the User engaged with the Platform.\n", 3));

        list.add(new General_Queeries_data("10. We shall be entitled to add, to vary or amend any or all these terms and conditions at any time and the User shall be bound by such addition, variation or amendment once such addition, variation or amendment is incorporated into these terms and conditions, and such amended terms and conditions are published on the Platform.\n", 3));

        list.add(new General_Queeries_data("3. Indemnification\n", 2));

        list.add(new General_Queeries_data("1. You undertake to indemnify Us, for any losses or damages resulting from any third party claims or complaints arising from, or in connection with Your actions on the Platform, and/or breach of these Terms of Use.\n", 3));

        list.add(new General_Queeries_data("4. Termination\n", 2));

        list.add(new General_Queeries_data("1. We may terminate these Terms of Use with respect to You, immediately without notice in the event of any breach by You of these Terms of Use or any of our applicable policies, as posted on the Platform from time to time or upon a misuse of the services by You.\n", 3));

        list.add(new General_Queeries_data("2. You agree that upon the termination of these Terms of Use, We may delete all information related to You with respect to the services availed by you. Further, You will no longer be able to access the Platform.\n", 3));

        list.add(new General_Queeries_data("5. Severability", 2));

        list.add(new General_Queeries_data("\n1. If any part of the Terms of Use are determined to be invalid or unenforceable pursuant to Applicable Laws, including, but not limited to, the warranty disclaimers and liability limitations set forth above, then the invalid or unenforceable provision will be deemed to be superseded by a valid, enforceable provision that most closely matches the intent of the original provision and the remainder of the Terms of Use for services shall continue in effect.", 3));

        list.add(new General_Queeries_data("6. General", 2));

        list.add(new General_Queeries_data("\n1. Unless otherwise specified herein, these Terms of Use for services aggregated through the Platform and the Privacy Policy (provided on the Platform) constitutes the entire agreement between you and the Platform, in respect of the services and supersedes all previous written and oral agreements between You and the Platform, if any. Our failure to act with respect to a breach by you or others does not waive Our right to act with respect to subsequent or similar breaches.\n", 3));

        list.add(new General_Queeries_data("7. Governing Law\n", 2));

        list.add(new General_Queeries_data("1. Terms of Use shall be governed by and constructed in accordance with the Applicable Law without reference to conflict of laws and principles. The courts in New Delhi, shall have the exclusive jurisdiction to determine any disputes arising in relation to, or under, these Terms of Use.\n", 3));

        list.add(new General_Queeries_data("8. Grievance Officer\n", 2));

        list.add(new General_Queeries_data("1. In accordance with Information Technology Act 2000 and rules made there under, name and contact details of the Grievance Officer are provided below:\n", 3));

        list.add(new General_Queeries_data("Attention: Sanjeev Maurya, Operations Manager\n" +
                "Email: coo@mekvahan.com\n", 2));

    }
}
