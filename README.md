Aim: To send data from one activity to another.

Empty Activity.
Project View - Select Android
  app>java>com.example.acer.myfirstapplication>MainActivity
    *Is the entry point of our application. The system launches an instance of this Activity and loads its layout.
 
  app>res>layout>activity_main.xml
    *Defines the layout for the acitivity's UI. It contains a "TextView" element with the text "Hello World!"
   
  app>manifests>AndroidManifest.xml
    *Describes the fundamental characterstics of the app and each of its components.
    
  Gradle Scripts>build.gradle
    *There are two such files one for project and second for "app" module. It is similar to makefile to compile and 
      build the app.
      
Layout are containers and control how their child views are positioned on the screen.
Widgets are UI components such as buttons and text boxes.

![Alt text](https://o7planning.org/en/10423/cache/images/i/1189616.png)

By default we have ConstraitLayout, it defines position for each view based on constraints to sibling views and the parent
layout.

In the activity_main.xml we add the components that is UI.
1)Add Text input
2)Add Button

<EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Name"
        android:id="@+id/iname"/>

<Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Go To"
        android:id="@+id/button"
        android:onClick="sendMessage" //when clicked will call sendMessage method from MainActivity.java file.
        />

Sending these entered data onto another Activity i.e. by adding a method that takes us to the other activity.

We need to bind the widget-id to widget-variable and each widget have their own variable i.e. EditText,Button,TextView etc.
 *Declare them inside MainActivity class
   EditText editname; //name can be same as widget_id or different
   Button clickbutton;

 *Inside onCreate
        editname = findViewById(R.id.iname);
        clickbutton = findViewById(R.id.button);


======>In MainActivity.java

//call this method when user taps the button
    public void sendMessage(View view) { //it is a view object that is clicked
        //do something on response
        String passname = editname.getText().toString();  //to get text from user and store in pname
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("Name",passname); //pass the entered name

        startActivity(intent);

    }
    
Intent: Is an object that provides runtime binding between seperate components, such as two activities.
The intent represents an app's intent to do something.
Intent intent = new Intent(this,newactivity.class);
*Above code takes you to the next activity.

****IF WE WANT TO PASS VALUES FROM ACTIVITY TO ACTIVITY****
After above intent code
intent.putExtra("Text",variable); //Text is used to recognise as to which variable you want to accept on the other activity.

========>In Main2Activity.java // in XML file we have create a TextView widget with id:dname


  *Declare widget variable :- TextView textname;
  *Bind the id to this variable :- textname = findViewById(R.id.dname);
  
To make a connection between the intents

Intent intent = getIntent(); // to get the intent
String getname= intent.getStringExtra("Name");
textname.setText("Name"+getname); 
___________________________________________________________

MainActivity

![Alt text](https://github.com/hosamanisachin/MyFirstApplication/blob/master/1.png) 

img1

___________________________________________________________
Main2Activity

![Alt text](https://github.com/hosamanisachin/MyFirstApplication/blob/master/2.png) 

img2
