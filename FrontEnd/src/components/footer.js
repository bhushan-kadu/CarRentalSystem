function Footer(){
    return(
      
             <div >
            
          <div className="d-flex bd-highlight " style={{marginLeft:"30px"}}>
           <div className="p-2 bd-highlight justify-content-around">
           <a href="Help.js"  className="btn btn-outline-info " >Help Centre</a>
           </div>
           <div className="p-2 bd-highlight justify-content-around">
               <a href="about.js" style={{marginLeft:"30px",width:"auto"}} className="btn btn-outline-info">About Us</a>
           </div>
           <div className="p-2 bd-highlight justify-content-around">
               <a href="TAC.js" style={{marginLeft:"30px",width:"auto"}} className="btn btn-outline-info"> Terms and conditions</a>
              </div>
           
                  
         <div className="ms-auto  bd-highlight">
         <h5 style={{color:"darkgray"}}> Contact Us : </h5>
             <a href="https://www.google.com" style={{ padding: 10 ,fontSize:"25px"}}  ><ion-icon  name="logo-google"></ion-icon></a>
            <a href="https://www.facebook.com"  style={{ padding: 10,fontSize:"25px" }}><ion-icon name="logo-facebook"></ion-icon></a>
            <a href="https://linkedin.com"  style={{ padding: 10 ,fontSize:"25px"}}><ion-icon name="logo-linkedin"></ion-icon></a>
            <a href="https://twitter.com"  style={{ padding: 10 ,fontSize:"25px"}}><ion-icon name="logo-twitter"></ion-icon></a>
            
            </div>
            
            </div>
           
        </div>
       
           
    )

}
export default Footer