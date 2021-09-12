import Home from 'pages/Home';
import DashBoard from 'pages/Home/Dashboard';
import { BrowserRouter, Switch, Route } from 'react-router-dom'

const Routes = () => {
    return (
       <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home/>
                </Route>
                <Route path="/dashboard">
                    <DashBoard/>
                </Route>
            </Switch>
       </BrowserRouter>
     );
  }
  
  export default Routes;