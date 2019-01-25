const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {flights: []};
    }

    componentDidMount () {
        client({method: 'GET', path: '/api/flights'}).done(response => {
            console.log(response);
            this.setState({flights: response.entity._embedded.flights});
        });
    }

    render() {
        return (
            <FlightList flights={this.state.flights}/>
    )
    }
}

class FlightList extends React.Component{
    render() {
        const flights = this.props.flights.map(flight =>
            <Flight key={flight._links.self.href} flight={flight}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>Brand</th>
                    <th>Departure</th>
                    <th>Arrival</th>
                </tr>
                {flights}
                </tbody>
            </table>
        )
    }
}

class Flight extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.flight.brand}</td>
                <td>{this.props.flight.departure}</td>
                <td>{this.props.flight.arrival}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)