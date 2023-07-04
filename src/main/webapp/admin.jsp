<%@ page import="com.dbhandler.fetchdata" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>

<script>
function opentab(tabname) {
  var tabcontent = document.getElementsByClassName('tab');
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  
  document.getElementById(tabname).style.display = "block";
}

</script>
</head>
<body>
  <div class="panel">
    <div class="button-panel">
      <button onclick="opentab('tab1')">View Customer Info</button>
      <button onclick="opentab('tab2')">Add Hotels</button>
      <button onclick="opentab('tab3')">Add Items</button>
      <button onclick="opentab('tab4')">View Items</button>
    </div>
    
    <div class="user-container">
      <div class="tab" id="tab1" style="display:none;">
        <table border>
          <thead>
            <tr>
              <th>U_Id</th>
              <th>Username</th>
              <th>Email</th>
              <th>Phone</th>
              <th>Date</th>
            </tr>
          </thead>
          <tbody>
            <% 
              List userlist = fetchdata.fetchuserinfo();
              for (int i = 0; i < userlist.size(); i++) {
                String[] cust = ((String)userlist.get(i)).split(":"); 
            %>
            <tr>
              <td><%= cust[0] %></td>
              <td><%= cust[1] %></td>
              <td><%= cust[2] %></td>
              <td><%= cust[3] %></td>
              <td><%= cust[4] %></td>
            </tr>
            <% } %>
          </tbody>
        </table>
      </div>
      
      <div class="tab" id="tab2" style="display:none;">
        <h1>Add Hotels</h1>
        <form action="addh" method="post">
          <label><b>Hotel Name</b></label>
          <input type="text" name="hname" id="hotel-name" />
          <br><br>
          <label><b>Address</b></label>
          <input type="text" name="address" id="hotel-address" />
          <br><br>
          <label><b>Hotel Category</b></label>
          <input type="text" name="category" id="hotel-category" placeholder="veg/nonveg" />
          <br><br>
          <input type="submit" value="Add" id="sub" />
          <br>
        </form>
      </div>
      
      <!-- Add remaining tab contents here -->
      
    </div>
  </div>
</body>
</html>
