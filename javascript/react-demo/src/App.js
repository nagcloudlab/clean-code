import 'bootstrap/dist/css/bootstrap.min.css';


// dev-1:
function TopicList() {
  return (
    <ul className="list-group">
      <li className="list-group-item">
        <a href="/topic/1">Topic 1</a>
      </li>
      <li className="list-group-item">
        <a href="/topic/2">Topic 2</a>
      </li>
      <li className="list-group-item">
        <a href="/topic/3">Topic 3</a>
      </li>
    </ul>
  );
}

// dev-2:
function TopicDetails() {
  return (
    <>
      <h2>Topic 1</h2>
      <p>This is the content of topic 1.</p>
    </>
  );
}


// HOF

function withCard(Component) {
  return function (props) {
    return (
      <div className="card">
        <div className="card-header bg-primary">{props.title}</div>
        <div className="card-body">
          <Component {...props} />
        </div>
      </div>
    );
  }
}



function App() {
  return (
    <div className="container">
      <h1 className="display-1">Demo UI</h1>
      <hr />
      <div>
        <div className="row">
          <div className="col-4">
            {withCard(TopicList)({ title: 'Topics' })}
          </div>
          <div className="col-8">
            {withCard(TopicDetails)({ title: 'Topic Details' })}
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
