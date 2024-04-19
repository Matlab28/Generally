package KontaktHome;

public class LogicFlow {

    String category;

    public void mapDtoToEntity() {}
    public KontaktDto mapEntityToDto() {return  KontaktDto}




    public String logicFlow(KontaktDto dto) {
        if (dto.getUserRequest().equals(category)) {
            return mapEntityToDto(dto);
        }
        return "Please select same category of device";
    }
}
