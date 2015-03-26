<h1>User service</h1>
<h2>Purpose of this service</h2>
<p>Expose endpoints for a RESTFUL webservice for CRUD operations on users</p>
<p>This webservice accepts json, and supports json responses.</p>
<h2>Endpoints</h2>
<h3>/</h3>
<ul>
    <li><code>GET</code> returns a json object with available links for this webservice (not relevant for consumers beyond exploring the api)</li>
</ul>
<h3>/users</h3>
<ul>
    <li><code>GET</code> Fetch all users as a json object (accepts "page", "size" and "sort" parameters)</li>
    <li><code>POST</code>Create a new user</li>
</ul>
<h3>/users/{id}</h3>
<ul>
    <li><code>GET</code>Fetch a specific user as a json object where {id} is the ID of the user</li>
    <li><code>PUT</code>Update a specific user where {id} is the ID of the user</li>
</ul>
<h2>About this service</h2>
<p>This service is made using Spring Boot and kotlin.</p>