import Strike from "./Strike"
import Tile from "./Tile"

const Board = () => {
  return (
    <div className="board">
        <Tile />
        <Tile />
        <Tile />

        <Tile />
        <Tile />
        <Tile />

        <Tile />
        <Tile />
        <Tile />

        <Strike />
    </div>
  )
}

export default Board