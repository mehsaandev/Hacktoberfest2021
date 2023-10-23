import Strike from "./Strike"
import Tile from "./Tile"

const Board = () => {
  return (
    <div className="board">
        <Tile className="right-border bottom-border"/>
        <Tile className="right-border bottom-border"/>
        <Tile className="bottom-border"/>

        <Tile className="right-border bottom-border"/>
        <Tile className="right-border bottom-border"/>
        <Tile className="bottom-border"/>

        <Tile className="right-border"/>
        <Tile className="right-border"/>
        <Tile />

        <Strike />
    </div>
  )
}

export default Board