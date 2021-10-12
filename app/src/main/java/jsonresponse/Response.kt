package jsonresponse

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("endDate")
	val endDate: String? = null,

	@field:SerializedName("description")
	val description: Any? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("equipmentId")
	val equipmentId: String? = null,

	@field:SerializedName("rentalDescription")
	val rentalDescription: Any? = null,

	@field:SerializedName("prolongDates")
	val prolongDates: List<Any?>? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("startDateMilliseconds")
	val startDateMilliseconds: Long? = null,

	@field:SerializedName("overwriteDate")
	val overwriteDate: Any? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("equipment")
	val equipment: Equipment? = null,

	@field:SerializedName("filters")
	val filters: List<FiltersItem?>? = null,

	@field:SerializedName("releaseDates")
	val releaseDates: List<Any?>? = null,

	@field:SerializedName("internalTransportations")
	val internalTransportations: InternalTransportations? = null,

	@field:SerializedName("hasDriver")
	val hasDriver: Boolean? = null,

	@field:SerializedName("endDateMilliseconds")
	val endDateMilliseconds: Long? = null,

	@field:SerializedName("requestedBy")
	val requestedBy: String? = null,

	@field:SerializedName("metaInfo")
	val metaInfo: Any? = null,

	@field:SerializedName("warehouseId")
	val warehouseId: Any? = null,

	@field:SerializedName("organization")
	val organization: String? = null,

	@field:SerializedName("locations")
	val locations: Locations? = null,

	@field:SerializedName("acceptedBy")
	val acceptedBy: Any? = null,

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("projectId")
	val projectId: String? = null,

	@field:SerializedName("startDate")
	val startDate: String? = null,

	@field:SerializedName("isDummy")
	val isDummy: Boolean? = null,

	@field:SerializedName("status")
	val status: String? = null
) {
    val title: Any?
		get() {
			TODO()
		}
}

data class Brand(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class Value(

	@field:SerializedName("W")
	val W: String? = null,

	@field:SerializedName("H")
	val H: String? = null,

	@field:SerializedName("L")
	val L: String? = null,

	@field:SerializedName("min")
	val min: Int? = null,

	@field:SerializedName("max")
	val max: Int? = null
)

data class TelematicsItem(

	@field:SerializedName("lastLatLonPrecise")
	val lastLatLonPrecise: Boolean? = null,

	@field:SerializedName("locationName")
	val locationName: String? = null,

	@field:SerializedName("lastLongitude")
	val lastLongitude: Double? = null,

	@field:SerializedName("lastAddressByLatLon")
	val lastAddressByLatLon: String? = null,

	@field:SerializedName("costCenter")
	val costCenter: String? = null,

	@field:SerializedName("location")
	val location: Location? = null,

	@field:SerializedName("eventType")
	val eventType: String? = null,

	@field:SerializedName("projectId")
	val projectId: String? = null,

	@field:SerializedName("equipmentId")
	val equipmentId: String? = null,

	@field:SerializedName("lastLatitude")
	val lastLatitude: Double? = null,

	@field:SerializedName("timestamp")
	val timestamp: Long? = null
)

data class Locations(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class DeliveryLocation(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class PickUpLocation(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class SpecificationsItem(

	@field:SerializedName("value")
	val value: String? = null,

	@field:SerializedName("key")
	val key: String? = null
)

data class Tag(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("authorName")
	val authorName: String? = null,

	@field:SerializedName("media")
	val media: List<Any?>? = null
)

data class Category(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("name_de")
	val nameDe: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("media")
	val media: List<Any?>? = null
)

data class FiltersItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("value")
	val value: Value? = null
)

data class Location(

	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class InternalTransportations(

	@field:SerializedName("templatePGroup")
	val templatePGroup: String? = null,

	@field:SerializedName("pickUpDateMilliseconds")
	val pickUpDateMilliseconds: Long? = null,

	@field:SerializedName("deliveryLocation")
	val deliveryLocation: DeliveryLocation? = null,

	@field:SerializedName("endDateOption")
	val endDateOption: Any? = null,

	@field:SerializedName("description")
	val description: Any? = null,

	@field:SerializedName("startDateOption")
	val startDateOption: Any? = null,

	@field:SerializedName("pickUpLocationAddress")
	val pickUpLocationAddress: String? = null,

	@field:SerializedName("deliveryLocationAddress")
	val deliveryLocationAddress: String? = null,

	@field:SerializedName("deliveryDateMilliseconds")
	val deliveryDateMilliseconds: Long? = null,

	@field:SerializedName("pickUpDate")
	val pickUpDate: String? = null,

	@field:SerializedName("isOrganizedWithoutSam")
	val isOrganizedWithoutSam: Any? = null,

	@field:SerializedName("pGroup")
	val pGroup: String? = null,

	@field:SerializedName("provider")
	val provider: String? = null,

	@field:SerializedName("endDateOptionMilliseconds")
	val endDateOptionMilliseconds: Any? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("deliveryDate")
	val deliveryDate: String? = null,

	@field:SerializedName("pickUpLocation")
	val pickUpLocation: PickUpLocation? = null,

	@field:SerializedName("projectRequestId")
	val projectRequestId: String? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("startDateOptionMilliseconds")
	val startDateOptionMilliseconds: Any? = null
)

data class FilesItem(

	@field:SerializedName("path")
	val path: String? = null,

	@field:SerializedName("size")
	val size: String? = null
)

data class Equipment(

	@field:SerializedName("dailyPrice")
	val dailyPrice: Any? = null,

	@field:SerializedName("unique_equipment_id")
	val uniqueEquipmentId: String? = null,

	@field:SerializedName("modelId")
	val modelId: String? = null,

	@field:SerializedName("year")
	val year: Int? = null,

	@field:SerializedName("beaconType")
	val beaconType: Any? = null,

	@field:SerializedName("responsible_person")
	val responsiblePerson: Any? = null,

	@field:SerializedName("beaconId")
	val beaconId: String? = null,

	@field:SerializedName("telematics")
	val telematics: List<TelematicsItem?>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("inventory")
	val inventory: Any? = null,

	@field:SerializedName("specifications")
	val specifications: List<SpecificationsItem?>? = null,

	@field:SerializedName("equipmentMedia")
	val equipmentMedia: List<EquipmentMediaItem?>? = null,

	@field:SerializedName("wareHouse")
	val wareHouse: Any? = null,

	@field:SerializedName("organizationId")
	val organizationId: String? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("next_check")
	val nextCheck: String? = null,

	@field:SerializedName("inactive")
	val inactive: Any? = null,

	@field:SerializedName("navaris_criteria")
	val navarisCriteria: Any? = null,

	@field:SerializedName("isMoving")
	val isMoving: Boolean? = null,

	@field:SerializedName("model")
	val model: Model? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tag")
	val tag: Tag? = null,

	@field:SerializedName("workingHours")
	val workingHours: Any? = null,

	@field:SerializedName("brand")
	val brand: Brand? = null,

	@field:SerializedName("special_number")
	val specialNumber: Any? = null,

	@field:SerializedName("trackingTag")
	val trackingTag: Any? = null,

	@field:SerializedName("telematicBox")
	val telematicBox: Any? = null,

	@field:SerializedName("weight")
	val weight: Int? = null,

	@field:SerializedName("structureId")
	val structureId: String? = null,

	@field:SerializedName("RFID")
	val rFID: String? = null,

	@field:SerializedName("serial_number")
	val serialNumber: Any? = null,

	@field:SerializedName("bgl_number")
	val bglNumber: String? = null,

	@field:SerializedName("test_type")
	val testType: Any? = null,

	@field:SerializedName("structure")
	val structure: Structure? = null,

	@field:SerializedName("invNumber")
	val invNumber: String? = null,

	@field:SerializedName("warehouseId")
	val warehouseId: String? = null,

	@field:SerializedName("beaconVendor")
	val beaconVendor: String? = null,

	@field:SerializedName("brandId")
	val brandId: String? = null,

	@field:SerializedName("additional_specifications")
	val additionalSpecifications: Any? = null,

	@field:SerializedName("last_check")
	val lastCheck: String? = null,

	@field:SerializedName("dont_send_to_as400")
	val dontSendToAs400: Boolean? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("categoryId")
	val categoryId: String? = null
)

data class EquipmentMediaItem(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("modelId")
	val modelId: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("files")
	val files: List<FilesItem?>? = null,

	@field:SerializedName("main")
	val main: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("modelType")
	val modelType: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Model(

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("brand")
	val brand: Brand? = null
)

data class Structure(

	@field:SerializedName("color")
	val color: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)
