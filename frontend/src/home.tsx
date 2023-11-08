import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import React, { useEffect, useState } from 'react';
import { useParams , } from 'react-router-dom';






function App() {
  const [data, setData] = useState<any>(null);
  const { key } = useParams();

  console.log(key)
   
  

  useEffect(() => {
    const apiUrl = `http://localhost:8080/MockApi/getDetails/${key}`;
    fetch(apiUrl)
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        // Handle the API response data
        setData(data);
        console.log(data);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });
  }, [key]);

 
  
   

  return (
    <div className="container col-12 col-md-3 mt-5 ">
      <div>
        <div className="row justify-content-center border border-secondary p-3 rounded text-center shadow">
          <div className="col-md-7">
            <h2 className="text-center">ABC Company</h2>
            <form className="mt-3 text-center">
              <div className='container'>
                {data && <h4 className="text-center pt-5">MSISDN: {data.msisdn}</h4>}
                {data && <h4 className="text-center pt-5">ServerRef: {data.severRef}</h4>}   
              </div>
  
              <div className="mb-3 pt-5 text-center">
                <input
                  type="text"
                  name="OTP"
                  className="form-control"
                  placeholder="OTP"
                />
              </div>
              <button type="submit" className="btn btn-primary w-100">
                Submit
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
  
  
    
  }
  
  export default App;
  