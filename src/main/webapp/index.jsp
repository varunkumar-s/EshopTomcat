<%--

    PHR_JavaWebService

    Copyright (C) 1999-2014 Photon Infotech Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

            http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
<!DOCTYPE html>
<head>
    <title>Java WebServices</title>

    <style type="text/css">

        /*** central column on page ***/
        div#divContainer{
            max-width: 100%;
            height: 100%;
            margin: 20px auto;
            padding: 0.5em 1em 1em 1em;

            /* rounded corners */
            -moz-border-radius: 10px;
            -webkit-border-radius: 10px;
            border-radius: 10px;

            /* add gradient */


            /* add box shadows */
            color: #000000;
            background-image: -webkit-gradient(linear,
                              left bottom,
                              left top,
                              color-stop(0, rgb(100,16,19)),
                              color-stop(0.56, rgb(0,0,0)),
                              color-stop(0.84, rgb(0,0,0)),
                              color-stop(0.96, rgb(70,11,13))
            );
            background-image: -moz-linear-gradient(
                              center bottom,
                              rgb(100,16,19) 0%,
                              rgb(0,0,0) 56%,
                              rgb(0,0,0) 84%,
                              rgb(70,11,13) 96%
            );
            background: -o-linear-gradient(top, rgba(70,11,13,1) 0%,rgba(0,0,0,1) 44%,rgba(100,15,17,1) 100%); /* Opera11.10+ */
            background: -ms-linear-gradient(top, rgba(70,11,13,1) 0%,rgba(0,0,0,1) 44%,rgba(100,15,17,1) 100%); /* IE10+ */
            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#460b0d', endColorstr='#640f11',GradientType=0 ); /* IE6-9 */
            background: linear-gradient(top, rgba(70,11,13,1) 0%,rgba(0,0,0,1) 44%,rgba(100,15,17,1) 100%); /* W3C */

            font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
            font-size: 13px;
            border: 3px solid #3A090B;
        }

        h1 {color:#fff; font-size:1.5em;}

        .content {
            border: 3px solid #3A090B;
            border-radius: 10px 10px 6px 6px;
        }

        /*** sample table to demonstrate CSS3 formatting ***/
        table.formatHTML5 {
            width: 100%;
            border-collapse:collapse;
            text-align:left;
            color: #fff;
            none repeat scroll 0 0 transparent
        }

        /*** table's thead section, head row style ***/
        table.formatHTML5 thead tr td  {
            vertical-align:middle;
            padding: 0.6em;
            font-size:0.8em;
            background: -moz-linear-gradient(center top , #000000 0%, #3A090B 100%) repeat scroll 0 0 transparent
            border: 3px solid #3A090B;
            height: 40px;
        }

        /*** table's thead section, coulmns header style ***/
        table.formatHTML5 thead tr th
        {
            padding: 0.5em;
            /* add gradient */
            background: -webkit-gradient(linear, left top, left bottom, from(#850E11), to(#630A0A));
            background: -moz-linear-gradient(top, #850E11, #630A0A);
            color: #fff;
        }

        /*** table's tbody section, odd rows style ***/
        table.formatHTML5 tbody tr:nth-child(odd) {

        }

        /*** hover effect to table's tbody odd rows ***/
        table.formatHTML5 tbody tr:nth-child(odd):hover
        {
            cursor:pointer;
            /* add gradient */
            background-color: #850E11;
            color: #fff;
        }

        /*** table's tbody section, even rows style ***/
        table.formatHTML5 tbody tr:nth-child(even) {

        }

        /*** hover effect to apply to table's tbody section, even rows ***/
        table.formatHTML5 tbody tr:nth-child(even):hover
        {
            cursor:pointer;
            /* add gradient */
            background-color: #850E11;
            color: #fff;
        }

       /*** table's tbody section, last row style ***/
        table.formatHTML5 tbody tr:last-child {
             border-bottom: solid 1px #3A090B;
        }

        /*** table's tbody section, separator row pseudo-class ***/
        table.formatHTML5 tbody tr.separator {
            /* add gradient */
            background: -webkit-gradient(linear, left top, left bottom, from(#850E11), to(#630A0A));
            background: -moz-linear-gradient(top, #850E11, #630A0A);
            color: #fff;
        }

        /*** table's td element, all section ***/
        table.formatHTML5 td {
           vertical-align:middle;
           padding: 0.5em;
        }

        /*** table's tfoot section ***/
        table.formatHTML5 tfoot{
            text-align:center;
            color:#fff;
            text-shadow: 0 1px 1px rgba(255,255,255,0.3);
        }

    </style>

</head>
<body>

    <!-- centtered column on the page-->
    <div id="divContainer">

        <h1>Java WebServices</h1>

        <!-- html5 table formatted via css3-->
        <div class="content">
            <table class="formatHTML5" >

                <!-- table header-->
                <thead>
                   <tr><td colspan=3>Java EShop Web Services</td></tr>
                    <tr>
                        <th>Configuration WebService</th>
                    </tr>
                </thead>

                <!-- table body: main content-->
                <tbody>
                    <tr>
                        <td>
                            http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/config    - Configuration webservice (Eg: http://localhost:8080/eshop/rest/api/config)
                        </td>
                    </tr>

                    <!--separator row used different style-->
                    <tr class="separator">
                        <td colspan="3">EShop WebServices</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/categories - Listing all the categories (Eg: Television, Computer)</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/categories/&lt;categoryId&gt; - Listing all the products for a given category id (Eg: 1)</td>
                    </tr>
                     <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/products - Display All Products and details </td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/products/&lt;productId&gt; - Product details for a given product id (Eg: 1)</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/products/&lt;productId&gt;/reviews - Listing reviews for a given product id (Eg: 1)</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/newproducts - Listing new products</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/specialproducts - Listing special products</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/products/search/&lt;searchtext&gt; - Search and list the product, for a given search word(Eg: lg)</td>
                    </tr>
                    <tr>
                        <td>http:&lt;host&gt;:&lt;port&gt;/&lt;context&gt;/rest/api/product/post/review - Post review for a product(Eg:  {"productId": 1,"userId": 1,"rating": 2,"comment": "comment comment comment","commentDate": "2012-1-09 00:00:00"})</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                </tbody>

                <!-- table footer-->
                <tfoot>
                    <tr><td>Copyright &#9400 2013 Photon Infotech</td></tr>
                </tfoot>
            </table>
        </div> <!-- content -->
    </div>
</body>
</html>