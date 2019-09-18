# internship_project
This project was assigned to me as a part of selection process of an internship. It includes a collapsing tool bar layout
with a view pager beneath, with two tabs within TabLayout. Was not able to get it right within the time frame allotted.
But for anyone wondering how to make a **collapsing tool bar layout nested with a view pager, a recycler-view and embedded 
fragments within view-pager**, here's the way to go forward.
## Steps:
1. Make sure you have the right dependencies within build.gradle(app) file. To check the latest dependencies installed in 
system go to File-->Project Structure-->dependencies-->(+)Add library dependency-->copy and paste the dependency name 
without version number-->search-->click on the latest version-->Add dependency--> sync.

2.Entire code within xml file should be organised in this order:
-->CoordinatorLayout
  -->AppBarlayout
     -->CollapsingToolBarLayout
     --> a RelativeLayout (or a LinearLayout) which is basically a layout for your Collapsing toolbar i.e what is to be
         shown in collpasing toolbar.
     -->TabLayout
     -->Toolbar
  -->ViewPager
     --> include layout:<layout of your fragment>
  Do not forget to include layout_collapseMode as shown in my repo code.
 
For a detailed sample with code checkout: https://gist.github.com/iPaulPro/1468510f046cb10c51ea along with my project code.
Do not forget to include layout_behaviour within ViewPager and included layout of the fragment class.

3. Within MainActivity, initialise toolbar and set it up with view pager, also i had to initialise recycler-view and layout
manager here and then again in my fragment class.

Thats it! You did it.


<img src="ezgif.com-crop.gif" height="50%" width="50%">

  
  
